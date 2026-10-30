package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunPullRequestTest {

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookCheckRunPullRequestBuilder builder = GitHubWebhookCheckRunPullRequestBuilder.builder(
                        CommonCatalogFixtures.webhookCheckRunPullRequest())
                .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookCheckRunPullRequestBuilder builder = GitHubWebhookCheckRunPullRequestBuilder.builder(
                        CommonCatalogFixtures.webhookCheckRunPullRequest())
                .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCheckRunPullRequestBuilder builder = GitHubWebhookCheckRunPullRequestBuilder.builder(
                        CommonCatalogFixtures.webhookCheckRunPullRequest())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
