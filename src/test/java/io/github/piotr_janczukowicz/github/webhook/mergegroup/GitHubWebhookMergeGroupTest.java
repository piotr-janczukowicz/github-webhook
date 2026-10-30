package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMergeGroupTest {

    @Test
    void constructor_shouldThrow_whenBaseRefNull() {
        final GitHubWebhookMergeGroupBuilder builder = GitHubWebhookMergeGroupBuilder.builder(
                        MergeGroupCatalogFixtures.webhookMergeGroup())
                .baseRef(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("baseRef");
    }

    @Test
    void constructor_shouldThrow_whenBaseShaNull() {
        final GitHubWebhookMergeGroupBuilder builder = GitHubWebhookMergeGroupBuilder.builder(
                        MergeGroupCatalogFixtures.webhookMergeGroup())
                .baseSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("baseSha");
    }

    @Test
    void constructor_shouldThrow_whenHeadCommitNull() {
        final GitHubWebhookMergeGroupBuilder builder = GitHubWebhookMergeGroupBuilder.builder(
                        MergeGroupCatalogFixtures.webhookMergeGroup())
                .headCommit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headCommit");
    }

    @Test
    void constructor_shouldThrow_whenHeadRefNull() {
        final GitHubWebhookMergeGroupBuilder builder = GitHubWebhookMergeGroupBuilder.builder(
                        MergeGroupCatalogFixtures.webhookMergeGroup())
                .headRef(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headRef");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookMergeGroupBuilder builder = GitHubWebhookMergeGroupBuilder.builder(
                        MergeGroupCatalogFixtures.webhookMergeGroup())
                .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }
}
