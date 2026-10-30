package io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestDependabotResponseSubmittedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestDependabotResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestDependabotResponseSubmittedEventBuilder.builder(
                                DismissalRequestDependabotCatalogFixtures
                                        .webhookDismissalRequestDependabotResponseSubmittedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenExemptionResponseNull() {
        final GitHubWebhookDismissalRequestDependabotResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestDependabotResponseSubmittedEventBuilder.builder(
                                DismissalRequestDependabotCatalogFixtures
                                        .webhookDismissalRequestDependabotResponseSubmittedEvent())
                        .exemptionResponse(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionResponse");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestDependabotResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestDependabotResponseSubmittedEventBuilder.builder(
                                DismissalRequestDependabotCatalogFixtures
                                        .webhookDismissalRequestDependabotResponseSubmittedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
