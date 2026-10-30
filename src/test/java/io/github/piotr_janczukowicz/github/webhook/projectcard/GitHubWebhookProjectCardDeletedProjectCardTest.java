package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardDeletedProjectCardTest {

    @Test
    void constructor_shouldThrow_whenColumnUrlNull() {
        final GitHubWebhookProjectCardDeletedProjectCardBuilder builder =
                GitHubWebhookProjectCardDeletedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardDeletedProjectCard())
                        .columnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("columnUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookProjectCardDeletedProjectCardBuilder builder =
                GitHubWebhookProjectCardDeletedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardDeletedProjectCard())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookProjectCardDeletedProjectCardBuilder builder =
                GitHubWebhookProjectCardDeletedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardDeletedProjectCard())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenProjectUrlNull() {
        final GitHubWebhookProjectCardDeletedProjectCardBuilder builder =
                GitHubWebhookProjectCardDeletedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardDeletedProjectCard())
                        .projectUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookProjectCardDeletedProjectCardBuilder builder =
                GitHubWebhookProjectCardDeletedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardDeletedProjectCard())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookProjectCardDeletedProjectCardBuilder builder =
                GitHubWebhookProjectCardDeletedProjectCardBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardDeletedProjectCard())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
