package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertDismissalRequestRequesterTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDependabotAlertDismissalRequestRequester fixture =
                DependabotAlertCatalogFixtures.webhookDependabotAlertDismissalRequestRequester();

        final GitHubWebhookDependabotAlertDismissalRequestRequester copy =
                GitHubWebhookDependabotAlertDismissalRequestRequesterBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
