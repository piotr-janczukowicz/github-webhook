package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewEditedReviewLinksTest {

    @Test
    void constructor_shouldThrow_whenHtmlNull() {
        final GitHubWebhookPullRequestReviewEditedReviewLinksBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewLinksBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReviewLinks())
                        .html(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("html");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewEditedReviewLinksBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewLinksBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReviewLinks())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }
}
