package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesEditedLabelTest {

    @Test
    void constructor_shouldThrow_whenColorNull() {
        final GitHubWebhookIssuesEditedLabelBuilder builder = GitHubWebhookIssuesEditedLabelBuilder.builder(
                        CommonCatalogFixtures.webhookIssuesEditedLabel())
                .color(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("color");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssuesEditedLabelBuilder builder = GitHubWebhookIssuesEditedLabelBuilder.builder(
                        CommonCatalogFixtures.webhookIssuesEditedLabel())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesEditedLabelBuilder builder = GitHubWebhookIssuesEditedLabelBuilder.builder(
                        CommonCatalogFixtures.webhookIssuesEditedLabel())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesEditedLabelBuilder builder = GitHubWebhookIssuesEditedLabelBuilder.builder(
                        CommonCatalogFixtures.webhookIssuesEditedLabel())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
