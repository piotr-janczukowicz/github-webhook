package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertFixedEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookCodeScanningAlertFixedEventBuilder builder =
                GitHubWebhookCodeScanningAlertFixedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenCommitOidNull() {
        final GitHubWebhookCodeScanningAlertFixedEventBuilder builder =
                GitHubWebhookCodeScanningAlertFixedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedEvent())
                        .commitOid(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitOid");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookCodeScanningAlertFixedEventBuilder builder =
                GitHubWebhookCodeScanningAlertFixedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedEvent())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCodeScanningAlertFixedEventBuilder builder =
                GitHubWebhookCodeScanningAlertFixedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCodeScanningAlertFixedEventBuilder builder =
                GitHubWebhookCodeScanningAlertFixedEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
