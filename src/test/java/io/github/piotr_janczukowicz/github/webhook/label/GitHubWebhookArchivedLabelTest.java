package io.github.piotr_janczukowicz.github.webhook.label;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookArchivedLabelTest {

    @Test
    void constructor_shouldThrow_whenArchivedAtNull() {
        final GitHubWebhookArchivedLabelBuilder builder = GitHubWebhookArchivedLabelBuilder.builder(
                        LabelCatalogFixtures.webhookArchivedLabel())
                .archivedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archivedAt");
    }

    @Test
    void constructor_shouldThrow_whenArchivedByNull() {
        final GitHubWebhookArchivedLabelBuilder builder = GitHubWebhookArchivedLabelBuilder.builder(
                        LabelCatalogFixtures.webhookArchivedLabel())
                .archivedBy(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archivedBy");
    }

    @Test
    void constructor_shouldThrow_whenColorNull() {
        final GitHubWebhookArchivedLabelBuilder builder = GitHubWebhookArchivedLabelBuilder.builder(
                        LabelCatalogFixtures.webhookArchivedLabel())
                .color(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("color");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookArchivedLabelBuilder builder = GitHubWebhookArchivedLabelBuilder.builder(
                        LabelCatalogFixtures.webhookArchivedLabel())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookArchivedLabelBuilder builder = GitHubWebhookArchivedLabelBuilder.builder(
                        LabelCatalogFixtures.webhookArchivedLabel())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookArchivedLabelBuilder builder = GitHubWebhookArchivedLabelBuilder.builder(
                        LabelCatalogFixtures.webhookArchivedLabel())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
