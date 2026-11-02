package io.github.piotr_janczukowicz.github.webhook.ping;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPingEventTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPingEvent fixture = PingCatalogFixtures.webhookPingEvent();

        final GitHubWebhookPingEvent copy =
                GitHubWebhookPingEventBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
