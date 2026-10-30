package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteRequestedCheckSuiteTest {

    @Test
    void constructor_shouldThrow_whenAppNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .app(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("app");
    }

    @Test
    void constructor_shouldThrow_whenCheckRunsUrlNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .checkRunsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRunsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHeadCommitNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .headCommit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headCommit");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
