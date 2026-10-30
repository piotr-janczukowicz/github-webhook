package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestDequeuedPullRequestBaseTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBase())
                        .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBase())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepoNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBase())
                        .repo(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repo");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBase())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
