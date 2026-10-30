package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;

import com.sun.net.httpserver.HttpServer;
import io.github.piotr_janczukowicz.testsupport.UnitTest;
import io.github.piotr_janczukowicz.util.FileUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.node.ObjectNode;

@UnitTest
class WebhookServerExampleTest {

    private static final byte[] SECRET = "It's a Secret to Everybody".getBytes(StandardCharsets.UTF_8);
    private static final JsonMapper TREE = JsonMapper.builder().build();

    private final List<String> printed = new ArrayList<>();
    private HttpServer server;

    @BeforeEach
    void startServer() throws IOException {
        server = WebhookServerExample.start(0, SECRET, printed::add);
    }

    @AfterEach
    void stopServer() {
        server.stop(0);
    }

    private int send(final String method, final String event, final String signature, final byte[] body)
            throws Exception {
        final HttpURLConnection connection = (HttpURLConnection)
                URI.create("http://127.0.0.1:" + server.getAddress().getPort() + "/github/webhook")
                        .toURL()
                        .openConnection();
        try {
            connection.setRequestMethod(method);
            if (event != null) {
                connection.setRequestProperty("X-GitHub-Event", event);
            }
            if (signature != null) {
                connection.setRequestProperty("X-Hub-Signature-256", signature);
            }
            if (body != null) {
                connection.setDoOutput(true);
                connection.getOutputStream().write(body);
            }
            return connection.getResponseCode();
        } finally {
            connection.disconnect();
        }
    }

    private int post(final String event, final String signature, final byte[] body) throws Exception {
        return send("POST", event, signature, body);
    }

    private static byte[] fixture(final String name) {
        return FileUtils.readBytes(WebhookServerExampleTest.class, name);
    }

    private static String sign(final byte[] body) {
        return GitHubWebhookVerifier.of(SECRET).sign(body);
    }

    @Test
    void post_shouldAnswer200AndPrintThePing_whenSignedFixtureSent() throws Exception {
        final byte[] body = fixture("ping/webhook-ping-event.json");

        final int status = post("ping", sign(body), body);

        assertThat(status).isEqualTo(200);
        assertThat(printed).hasSize(1);
        assertThat(printed.getFirst()).startsWith("ping");
    }

    @Test
    void post_shouldPrintThePushedRef_whenSignedPushSent() throws Exception {
        final byte[] body = fixture("push/webhook-push-event.json");

        final int status = post("push", sign(body), body);

        assertThat(status).isEqualTo(200);
        assertThat(printed).singleElement().asString().startsWith("push to ");
    }

    @Test
    void post_shouldPrintTheActionOfAFamilyWithActions_whenSignedEventSent() throws Exception {
        final ObjectNode node = (ObjectNode)
                TREE.readTree(fixture("pullrequestreview/webhook-pull-request-review-submitted-event.json"));
        final byte[] body = TREE.writeValueAsBytes(node.put("action", "submitted"));

        final int status = post("pull_request_review", sign(body), body);

        assertThat(status).isEqualTo(200);
        assertThat(printed).singleElement().asString().contains("GitHubWebhookPullRequestReviewSubmittedEvent");
    }

    @Test
    void post_shouldPrintAnUnknownEventAndAnswer200_whenTheEventIsNotKnown() throws Exception {
        final byte[] body = "{\"hello\":\"world\"}".getBytes(StandardCharsets.UTF_8);

        final int status = post("brand_new_event", sign(body), body);

        assertThat(status).isEqualTo(200);
        assertThat(printed).containsExactly("unknown event brand_new_event");
    }

    @Test
    void post_shouldAnswer401AndPrintNothing_whenSignatureWrong() throws Exception {
        final byte[] body = fixture("ping/webhook-ping-event.json");

        final int status = post("ping", "sha256=00", body);

        assertThat(status).isEqualTo(401);
        assertThat(printed).isEmpty();
    }

    @Test
    void post_shouldAnswer401_whenSignatureMissing() throws Exception {
        final byte[] body = fixture("ping/webhook-ping-event.json");

        assertThat(post("ping", null, body)).isEqualTo(401);
    }

    @Test
    void post_shouldAnswer400_whenSignedBodyIsNotJson() throws Exception {
        final byte[] body = "not json".getBytes(StandardCharsets.UTF_8);

        final int status = post("push", sign(body), body);

        assertThat(status).isEqualTo(400);
        assertThat(printed).isEmpty();
    }

    @Test
    void get_shouldAnswer405() throws Exception {
        assertThat(send("GET", null, null, null)).isEqualTo(405);
    }
}
