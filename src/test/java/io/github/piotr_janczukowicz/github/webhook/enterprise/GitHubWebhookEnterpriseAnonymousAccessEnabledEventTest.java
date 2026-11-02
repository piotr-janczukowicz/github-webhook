package io.github.piotr_janczukowicz.github.webhook.enterprise;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookEnterpriseAnonymousAccessEnabledEventTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookEnterpriseAnonymousAccessEnabledEvent fixture =
                EnterpriseCatalogFixtures.webhookEnterpriseAnonymousAccessEnabledEvent();

        final GitHubWebhookEnterpriseAnonymousAccessEnabledEvent copy =
                GitHubWebhookEnterpriseAnonymousAccessEnabledEventBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
