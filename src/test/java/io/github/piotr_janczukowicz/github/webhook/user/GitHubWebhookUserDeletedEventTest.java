package io.github.piotr_janczukowicz.github.webhook.user;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookUserDeletedEventTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookUserDeletedEvent fixture = UserCatalogFixtures.webhookUserDeletedEvent();

        final GitHubWebhookUserDeletedEvent copy =
                GitHubWebhookUserDeletedEventBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
