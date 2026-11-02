package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPushRulesetBypassExemptionRequestDataTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPushRulesetBypassExemptionRequestData fixture =
                CommonCatalogFixtures.webhookPushRulesetBypassExemptionRequestData();

        final GitHubWebhookPushRulesetBypassExemptionRequestData copy =
                GitHubWebhookPushRulesetBypassExemptionRequestDataBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
