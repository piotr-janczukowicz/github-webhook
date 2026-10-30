package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertUpdatedAssignmentEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookCodeScanningAlertUpdatedAssignmentEventBuilder builder =
                GitHubWebhookCodeScanningAlertUpdatedAssignmentEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertUpdatedAssignmentEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCodeScanningAlertUpdatedAssignmentEventBuilder builder =
                GitHubWebhookCodeScanningAlertUpdatedAssignmentEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertUpdatedAssignmentEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCodeScanningAlertUpdatedAssignmentEventBuilder builder =
                GitHubWebhookCodeScanningAlertUpdatedAssignmentEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertUpdatedAssignmentEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
