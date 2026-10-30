package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLockedPullRequestBaseTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBase())
                        .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBase())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepoNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBase())
                        .repo(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repo");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBase())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
