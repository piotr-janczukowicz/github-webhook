package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectColumnTest {

    @Test
    void constructor_shouldThrow_whenCardsUrlNull() {
        final GitHubWebhookProjectColumnBuilder builder = GitHubWebhookProjectColumnBuilder.builder(
                        ProjectColumnCatalogFixtures.webhookProjectColumn())
                .cardsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cardsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookProjectColumnBuilder builder = GitHubWebhookProjectColumnBuilder.builder(
                        ProjectColumnCatalogFixtures.webhookProjectColumn())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookProjectColumnBuilder builder = GitHubWebhookProjectColumnBuilder.builder(
                        ProjectColumnCatalogFixtures.webhookProjectColumn())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookProjectColumnBuilder builder = GitHubWebhookProjectColumnBuilder.builder(
                        ProjectColumnCatalogFixtures.webhookProjectColumn())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenProjectUrlNull() {
        final GitHubWebhookProjectColumnBuilder builder = GitHubWebhookProjectColumnBuilder.builder(
                        ProjectColumnCatalogFixtures.webhookProjectColumn())
                .projectUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookProjectColumnBuilder builder = GitHubWebhookProjectColumnBuilder.builder(
                        ProjectColumnCatalogFixtures.webhookProjectColumn())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookProjectColumnBuilder builder = GitHubWebhookProjectColumnBuilder.builder(
                        ProjectColumnCatalogFixtures.webhookProjectColumn())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
