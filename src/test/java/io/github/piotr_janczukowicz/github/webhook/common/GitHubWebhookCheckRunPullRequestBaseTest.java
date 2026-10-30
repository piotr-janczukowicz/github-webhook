package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunPullRequestBaseTest {

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookCheckRunPullRequestBaseBuilder builder = GitHubWebhookCheckRunPullRequestBaseBuilder.builder(
                        CommonCatalogFixtures.webhookCheckRunPullRequestBase())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepoNull() {
        final GitHubWebhookCheckRunPullRequestBaseBuilder builder = GitHubWebhookCheckRunPullRequestBaseBuilder.builder(
                        CommonCatalogFixtures.webhookCheckRunPullRequestBase())
                .repo(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repo");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookCheckRunPullRequestBaseBuilder builder = GitHubWebhookCheckRunPullRequestBaseBuilder.builder(
                        CommonCatalogFixtures.webhookCheckRunPullRequestBase())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
