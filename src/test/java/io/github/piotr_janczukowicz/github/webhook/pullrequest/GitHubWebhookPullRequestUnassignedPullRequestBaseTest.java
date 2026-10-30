package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestUnassignedPullRequestBaseTest {

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequestBase())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepoNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequestBase())
                        .repo(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repo");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequestBase())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
