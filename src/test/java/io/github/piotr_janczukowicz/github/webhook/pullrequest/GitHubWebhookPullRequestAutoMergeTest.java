package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestAutoMergeTest {

    @Test
    void constructor_shouldThrow_whenMergeMethodNull() {
        final GitHubWebhookPullRequestAutoMergeBuilder builder = GitHubWebhookPullRequestAutoMergeBuilder.builder(
                        PullRequestCatalogFixtures.webhookPullRequestAutoMerge())
                .mergeMethod(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergeMethod");
    }
}
