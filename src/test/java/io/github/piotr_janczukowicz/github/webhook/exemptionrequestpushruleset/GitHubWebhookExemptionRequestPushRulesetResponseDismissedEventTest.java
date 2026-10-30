package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetResponseDismissedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenExemptionResponseNull() {
        final GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetResponseDismissedEvent())
                        .exemptionResponse(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionResponse");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetResponseDismissedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
