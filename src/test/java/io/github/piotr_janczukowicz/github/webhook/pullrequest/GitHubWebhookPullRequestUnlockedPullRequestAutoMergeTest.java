package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestUnlockedPullRequestAutoMergeTest {

    @Test
    void constructor_shouldThrow_whenCommitTitleNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestAutoMergeBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestAutoMergeBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequestAutoMerge())
                        .commitTitle(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitTitle");
    }

    @Test
    void constructor_shouldThrow_whenMergeMethodNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestAutoMergeBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestAutoMergeBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequestAutoMerge())
                        .mergeMethod(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergeMethod");
    }
}
