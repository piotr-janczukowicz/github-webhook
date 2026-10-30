package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookExemptionRequestPushRulesetCompletedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookExemptionRequestPushRulesetCompletedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetCompletedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetCompletedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookExemptionRequestPushRulesetCompletedEventBuilder builder =
                GitHubWebhookExemptionRequestPushRulesetCompletedEventBuilder.builder(
                                ExemptionRequestPushRulesetCatalogFixtures
                                        .webhookExemptionRequestPushRulesetCompletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
