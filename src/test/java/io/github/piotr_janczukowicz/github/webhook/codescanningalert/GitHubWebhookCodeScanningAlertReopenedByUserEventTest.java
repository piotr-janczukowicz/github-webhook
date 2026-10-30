package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertReopenedByUserEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenCommitOidNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserEvent())
                        .commitOid(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitOid");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserEvent())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
