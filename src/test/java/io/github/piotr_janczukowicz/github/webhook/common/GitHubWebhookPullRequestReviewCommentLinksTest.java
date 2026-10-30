package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentLinksTest {

    @Test
    void constructor_shouldThrow_whenHtmlNull() {
        final GitHubWebhookPullRequestReviewCommentLinksBuilder builder =
                GitHubWebhookPullRequestReviewCommentLinksBuilder.builder(
                                CommonCatalogFixtures.webhookPullRequestReviewCommentLinks())
                        .html(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("html");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewCommentLinksBuilder builder =
                GitHubWebhookPullRequestReviewCommentLinksBuilder.builder(
                                CommonCatalogFixtures.webhookPullRequestReviewCommentLinks())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenSelfNull() {
        final GitHubWebhookPullRequestReviewCommentLinksBuilder builder =
                GitHubWebhookPullRequestReviewCommentLinksBuilder.builder(
                                CommonCatalogFixtures.webhookPullRequestReviewCommentLinks())
                        .self(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("self");
    }
}
