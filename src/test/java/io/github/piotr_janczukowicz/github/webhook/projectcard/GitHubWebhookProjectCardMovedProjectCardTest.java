package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardMovedProjectCardTest {

    @Test
    void constructor_shouldThrow_whenColumnUrlNull() {
        final GitHubWebhookProjectCardMovedProjectCardBuilder builder =
                GitHubWebhookProjectCardMovedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardMovedProjectCard())
                        .columnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("columnUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookProjectCardMovedProjectCardBuilder builder =
                GitHubWebhookProjectCardMovedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardMovedProjectCard())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookProjectCardMovedProjectCardBuilder builder =
                GitHubWebhookProjectCardMovedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardMovedProjectCard())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenProjectUrlNull() {
        final GitHubWebhookProjectCardMovedProjectCardBuilder builder =
                GitHubWebhookProjectCardMovedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardMovedProjectCard())
                        .projectUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookProjectCardMovedProjectCardBuilder builder =
                GitHubWebhookProjectCardMovedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardMovedProjectCard())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookProjectCardMovedProjectCardBuilder builder =
                GitHubWebhookProjectCardMovedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardMovedProjectCard())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
