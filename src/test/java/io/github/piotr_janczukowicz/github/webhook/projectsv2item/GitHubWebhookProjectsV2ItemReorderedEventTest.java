package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemReorderedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookProjectsV2ItemReorderedEventBuilder builder =
                GitHubWebhookProjectsV2ItemReorderedEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemReorderedEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2ItemReorderedEventBuilder builder =
                GitHubWebhookProjectsV2ItemReorderedEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemReorderedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2ItemNull() {
        final GitHubWebhookProjectsV2ItemReorderedEventBuilder builder =
                GitHubWebhookProjectsV2ItemReorderedEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemReorderedEvent())
                        .projectsV2Item(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2Item");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2ItemReorderedEventBuilder builder =
                GitHubWebhookProjectsV2ItemReorderedEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemReorderedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
