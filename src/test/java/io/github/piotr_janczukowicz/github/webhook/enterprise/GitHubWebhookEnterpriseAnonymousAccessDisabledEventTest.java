package io.github.piotr_janczukowicz.github.webhook.enterprise;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookEnterpriseAnonymousAccessDisabledEventTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookEnterpriseAnonymousAccessDisabledEvent fixture =
                EnterpriseCatalogFixtures.webhookEnterpriseAnonymousAccessDisabledEvent();

        final GitHubWebhookEnterpriseAnonymousAccessDisabledEvent copy =
                GitHubWebhookEnterpriseAnonymousAccessDisabledEventBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
