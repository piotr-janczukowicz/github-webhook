package io.github.piotr_janczukowicz.github.webhook;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import io.github.piotr_janczukowicz.github.webhook.ping.GitHubWebhookPingEvent;
import io.github.piotr_janczukowicz.github.webhook.push.GitHubWebhookPushEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

/**
 * A complete webhook endpoint in about fifty lines: a plain {@link HttpServer} that takes {@code POST /github/webhook},
 * lets {@link GitHubWebhookReceiver} verify the signature and decode the body, and prints what arrived.
 *
 * <p>Run {@link #main} with the webhook secret in the environment variable {@code WEBHOOK_SECRET} (and, optionally, the
 * port as the first argument; the default is 8080), then give GitHub a public URL that reaches it, for example with a
 * tunnel such as {@code ngrok http 8080}: repository Settings, Webhooks, Add webhook, Payload URL
 * {@code https://<tunnel>/github/webhook}, content type {@code application/json}, the same secret.
 *
 * <p>The answers are what GitHub expects: 200 for a delivery that was understood (also for events this library does not
 * know), 401 when the signature is missing or wrong (the body is not read), 400 when the body cannot be decoded, 405
 * for anything but POST.
 */
public final class WebhookServerExample {

    private static final String PATH = "/github/webhook";
    private static final String EVENT_HEADER = "X-GitHub-Event";
    private static final String SIGNATURE_HEADER = "X-Hub-Signature-256";
    private static final int DEFAULT_PORT = 8080;

    private WebhookServerExample() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Starts the endpoint on the loopback interface.
     *
     * @param port the port, or 0 for a free one (see {@link HttpServer#getAddress()})
     * @param secret the webhook secret
     * @param out receives one line for every delivery that was understood
     * @return the running server; stop it with {@link HttpServer#stop(int)}
     * @throws IOException if the port cannot be bound
     */
    public static HttpServer start(final int port, final byte[] secret, final Consumer<String> out) throws IOException {
        final GitHubWebhookReceiver receiver = GitHubWebhookReceiver.of(secret);
        final HttpServer server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), port), 0);
        server.createContext(PATH, exchange -> handle(exchange, receiver, out));
        server.start();
        return server;
    }

    private static void handle(
            final HttpExchange exchange, final GitHubWebhookReceiver receiver, final Consumer<String> out)
            throws IOException {
        try (exchange) {
            if (!"POST".equals(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                return;
            }
            final byte[] body = exchange.getRequestBody().readNBytes(GitHubWebhookDecoder.MAX_BODY_BYTES + 1);
            exchange.sendResponseHeaders(answer(exchange, receiver, body, out), -1);
        }
    }

    private static int answer(
            final HttpExchange exchange,
            final GitHubWebhookReceiver receiver,
            final byte[] body,
            final Consumer<String> out) {
        try {
            final GitHubWebhookEvent event = receiver.receive(
                    exchange.getRequestHeaders().getFirst(EVENT_HEADER),
                    exchange.getRequestHeaders().getFirst(SIGNATURE_HEADER),
                    body);
            out.accept(describe(event));
            return 200;
        } catch (GitHubWebhookSignatureException e) {
            return 401;
        } catch (GitHubWebhookDecodeException e) {
            return 400;
        }
    }

    /**
     * One line about a decoded event. A real service would act here; this is where the typed records pay off.
     *
     * @param event the decoded delivery
     * @return the line to print
     */
    static String describe(final GitHubWebhookEvent event) {
        return switch (event) {
            case GitHubWebhookPingEvent ping -> "ping: " + ping.zen();
            case GitHubWebhookPushEvent push ->
                "push to " + push.ref() + " of " + push.repository().fullName();
            case GitHubWebhookUnknownEvent unknown -> "unknown event " + unknown.eventName();
            default -> event.getClass().getSimpleName();
        };
    }

    /**
     * Runs the endpoint until the process is stopped.
     *
     * @param args the port (optional)
     * @throws IOException if the port cannot be bound
     */
    @SuppressWarnings("PMD.SystemPrintln") // A runnable example reports to the console.
    public static void main(final String[] args) throws IOException {
        final String secret = System.getenv("WEBHOOK_SECRET");
        if (secret == null || secret.isBlank()) {
            System.err.println("Set WEBHOOK_SECRET to the secret of the webhook.");
            return;
        }
        final int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;
        final HttpServer server = start(port, secret.getBytes(StandardCharsets.UTF_8), System.out::println);
        System.out.println(
                "Listening on http://127.0.0.1:" + server.getAddress().getPort() + PATH);
    }
}
