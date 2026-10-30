package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardTest {

    @Test
    void constructor_shouldThrow_whenColumnUrlNull() {
        final GitHubWebhookProjectCardBuilder builder = GitHubWebhookProjectCardBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCard())
                .columnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("columnUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookProjectCardBuilder builder = GitHubWebhookProjectCardBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCard())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookProjectCardBuilder builder = GitHubWebhookProjectCardBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCard())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenProjectUrlNull() {
        final GitHubWebhookProjectCardBuilder builder = GitHubWebhookProjectCardBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCard())
                .projectUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookProjectCardBuilder builder = GitHubWebhookProjectCardBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCard())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookProjectCardBuilder builder = GitHubWebhookProjectCardBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCard())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
