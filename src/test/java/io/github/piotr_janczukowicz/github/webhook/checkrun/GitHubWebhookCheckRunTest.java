package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunTest {

    @Test
    void constructor_shouldThrow_whenCheckSuiteNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .checkSuite(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuite");
    }

    @Test
    void constructor_shouldThrow_whenDetailsUrlNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .detailsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("detailsUrl");
    }

    @Test
    void constructor_shouldThrow_whenExternalIdNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .externalId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("externalId");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOutputNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .output(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("output");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenStartedAtNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .startedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("startedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCheckRunBuilder builder = GitHubWebhookCheckRunBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRun())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
