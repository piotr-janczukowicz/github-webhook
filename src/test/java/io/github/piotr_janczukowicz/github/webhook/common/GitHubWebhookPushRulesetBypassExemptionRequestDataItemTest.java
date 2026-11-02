package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPushRulesetBypassExemptionRequestDataItemTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPushRulesetBypassExemptionRequestDataItem fixture =
                CommonCatalogFixtures.webhookPushRulesetBypassExemptionRequestDataItem();

        final GitHubWebhookPushRulesetBypassExemptionRequestDataItem copy =
                GitHubWebhookPushRulesetBypassExemptionRequestDataItemBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
