package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookAlertInstanceTest {

    @Test
    void constructor_shouldThrow_whenAnalysisKeyNull() {
        final GitHubWebhookAlertInstanceBuilder builder = GitHubWebhookAlertInstanceBuilder.builder(
                        CodeScanningAlertCatalogFixtures.webhookAlertInstance())
                .analysisKey(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("analysisKey");
    }

    @Test
    void constructor_shouldThrow_whenEnvironmentNull() {
        final GitHubWebhookAlertInstanceBuilder builder = GitHubWebhookAlertInstanceBuilder.builder(
                        CodeScanningAlertCatalogFixtures.webhookAlertInstance())
                .environment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("environment");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookAlertInstanceBuilder builder = GitHubWebhookAlertInstanceBuilder.builder(
                        CodeScanningAlertCatalogFixtures.webhookAlertInstance())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookAlertInstanceBuilder builder = GitHubWebhookAlertInstanceBuilder.builder(
                        CodeScanningAlertCatalogFixtures.webhookAlertInstance())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }
}
