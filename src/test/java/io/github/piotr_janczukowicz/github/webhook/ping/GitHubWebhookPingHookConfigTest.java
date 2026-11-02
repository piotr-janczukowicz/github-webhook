package io.github.piotr_janczukowicz.github.webhook.ping;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPingHookConfigTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPingHookConfig fixture = PingCatalogFixtures.webhookPingHookConfig();

        final GitHubWebhookPingHookConfig copy =
                GitHubWebhookPingHookConfigBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
