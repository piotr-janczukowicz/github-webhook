package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertAppearedInBranchEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenCommitOidNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchEvent())
                        .commitOid(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitOid");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchEvent())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchEventBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
