package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertClosedByUserEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenCommitOidNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserEvent())
                        .commitOid(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitOid");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserEvent())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
