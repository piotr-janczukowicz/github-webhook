package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookExemptionRequestPushRulesetCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookExemptionRequestPushRulesetCreatedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetCreatedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetCreatedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookExemptionRequestPushRulesetCreatedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetCreatedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
