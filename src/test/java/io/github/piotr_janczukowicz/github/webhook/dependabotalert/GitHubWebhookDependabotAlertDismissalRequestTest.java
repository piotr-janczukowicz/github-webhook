package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertDismissalRequestTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDependabotAlertDismissalRequest fixture =
                DependabotAlertCatalogFixtures.webhookDependabotAlertDismissalRequest();

        final GitHubWebhookDependabotAlertDismissalRequest copy =
                GitHubWebhookDependabotAlertDismissalRequestBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
