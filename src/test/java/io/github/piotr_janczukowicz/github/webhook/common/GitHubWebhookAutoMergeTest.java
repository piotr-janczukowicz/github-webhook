package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookAutoMergeTest {

    @Test
    void constructor_shouldThrow_whenCommitMessageNull() {
        final GitHubWebhookAutoMergeBuilder builder = GitHubWebhookAutoMergeBuilder.builder(
                        CommonCatalogFixtures.webhookAutoMerge())
                .commitMessage(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitMessage");
    }

    @Test
    void constructor_shouldThrow_whenCommitTitleNull() {
        final GitHubWebhookAutoMergeBuilder builder = GitHubWebhookAutoMergeBuilder.builder(
                        CommonCatalogFixtures.webhookAutoMerge())
                .commitTitle(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitTitle");
    }

    @Test
    void constructor_shouldThrow_whenEnabledByNull() {
        final GitHubWebhookAutoMergeBuilder builder = GitHubWebhookAutoMergeBuilder.builder(
                        CommonCatalogFixtures.webhookAutoMerge())
                .enabledBy(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("enabledBy");
    }

    @Test
    void constructor_shouldThrow_whenMergeMethodNull() {
        final GitHubWebhookAutoMergeBuilder builder = GitHubWebhookAutoMergeBuilder.builder(
                        CommonCatalogFixtures.webhookAutoMerge())
                .mergeMethod(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergeMethod");
    }
}
