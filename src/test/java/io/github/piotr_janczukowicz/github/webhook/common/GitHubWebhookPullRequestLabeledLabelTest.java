package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLabeledLabelTest {

    @Test
    void constructor_shouldThrow_whenColorNull() {
        final GitHubWebhookPullRequestLabeledLabelBuilder builder = GitHubWebhookPullRequestLabeledLabelBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLabeledLabel())
                .color(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("color");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPullRequestLabeledLabelBuilder builder = GitHubWebhookPullRequestLabeledLabelBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLabeledLabel())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestLabeledLabelBuilder builder = GitHubWebhookPullRequestLabeledLabelBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLabeledLabel())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestLabeledLabelBuilder builder = GitHubWebhookPullRequestLabeledLabelBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLabeledLabel())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
