package io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestDependabotCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestDependabotCreatedEventBuilder builder =
                GitHubWebhookDismissalRequestDependabotCreatedEventBuilder.builder(
                                DismissalRequestDependabotCatalogFixtures
                                        .webhookDismissalRequestDependabotCreatedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestDependabotCreatedEventBuilder builder =
                GitHubWebhookDismissalRequestDependabotCreatedEventBuilder.builder(
                                DismissalRequestDependabotCatalogFixtures
                                        .webhookDismissalRequestDependabotCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
