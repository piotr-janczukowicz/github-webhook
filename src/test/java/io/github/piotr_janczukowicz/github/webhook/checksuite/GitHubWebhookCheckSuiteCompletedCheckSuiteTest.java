package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteCompletedCheckSuiteTest {

    @Test
    void constructor_shouldThrow_whenAppNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .app(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("app");
    }

    @Test
    void constructor_shouldThrow_whenCheckRunsUrlNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .checkRunsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRunsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHeadCommitNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .headCommit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headCommit");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteCompletedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
