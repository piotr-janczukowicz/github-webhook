package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLabelTest {

    @Test
    void constructor_shouldThrow_whenColorNull() {
        final GitHubWebhookPullRequestLabelBuilder builder = GitHubWebhookPullRequestLabelBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLabel())
                .color(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("color");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPullRequestLabelBuilder builder = GitHubWebhookPullRequestLabelBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLabel())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestLabelBuilder builder = GitHubWebhookPullRequestLabelBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLabel())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestLabelBuilder builder = GitHubWebhookPullRequestLabelBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLabel())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
