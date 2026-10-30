package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetResponseSubmittedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenExemptionResponseNull() {
        final GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetResponseSubmittedEvent())
                        .exemptionResponse(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionResponse");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetResponseSubmittedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
