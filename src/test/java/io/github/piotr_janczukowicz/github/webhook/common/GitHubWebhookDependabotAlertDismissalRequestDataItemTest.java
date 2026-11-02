package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertDismissalRequestDataItemTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDependabotAlertDismissalRequestDataItem fixture =
                CommonCatalogFixtures.webhookDependabotAlertDismissalRequestDataItem();

        final GitHubWebhookDependabotAlertDismissalRequestDataItem copy =
                GitHubWebhookDependabotAlertDismissalRequestDataItemBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
