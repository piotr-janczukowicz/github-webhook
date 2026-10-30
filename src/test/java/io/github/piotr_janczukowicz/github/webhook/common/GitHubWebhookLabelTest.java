package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookLabelTest {

    @Test
    void constructor_shouldThrow_whenColorNull() {
        final GitHubWebhookLabelBuilder builder = GitHubWebhookLabelBuilder.builder(
                        CommonCatalogFixtures.webhookLabel())
                .color(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("color");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookLabelBuilder builder = GitHubWebhookLabelBuilder.builder(
                        CommonCatalogFixtures.webhookLabel())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookLabelBuilder builder = GitHubWebhookLabelBuilder.builder(
                        CommonCatalogFixtures.webhookLabel())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookLabelBuilder builder = GitHubWebhookLabelBuilder.builder(
                        CommonCatalogFixtures.webhookLabel())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
