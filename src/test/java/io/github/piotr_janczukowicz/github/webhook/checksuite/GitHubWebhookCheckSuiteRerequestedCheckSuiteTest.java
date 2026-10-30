package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteRerequestedCheckSuiteTest {

    @Test
    void constructor_shouldThrow_whenAppNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .app(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("app");
    }

    @Test
    void constructor_shouldThrow_whenCheckRunsUrlNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .checkRunsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRunsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHeadCommitNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .headCommit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headCommit");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
