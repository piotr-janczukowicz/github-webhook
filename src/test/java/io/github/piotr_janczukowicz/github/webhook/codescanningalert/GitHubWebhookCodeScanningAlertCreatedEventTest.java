package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookCodeScanningAlertCreatedEventBuilder builder =
                GitHubWebhookCodeScanningAlertCreatedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenCommitOidNull() {
        final GitHubWebhookCodeScanningAlertCreatedEventBuilder builder =
                GitHubWebhookCodeScanningAlertCreatedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedEvent())
                        .commitOid(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitOid");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookCodeScanningAlertCreatedEventBuilder builder =
                GitHubWebhookCodeScanningAlertCreatedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedEvent())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCodeScanningAlertCreatedEventBuilder builder =
                GitHubWebhookCodeScanningAlertCreatedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCodeScanningAlertCreatedEventBuilder builder =
                GitHubWebhookCodeScanningAlertCreatedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
