package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertDismissalRequestDataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDependabotAlertDismissalRequestData fixture =
                CommonCatalogFixtures.webhookDependabotAlertDismissalRequestData();

        final GitHubWebhookDependabotAlertDismissalRequestData copy =
                GitHubWebhookDependabotAlertDismissalRequestDataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
