package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemRestoredEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookProjectsV2ItemRestoredEventBuilder builder =
                GitHubWebhookProjectsV2ItemRestoredEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemRestoredEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2ItemRestoredEventBuilder builder =
                GitHubWebhookProjectsV2ItemRestoredEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemRestoredEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2ItemNull() {
        final GitHubWebhookProjectsV2ItemRestoredEventBuilder builder =
                GitHubWebhookProjectsV2ItemRestoredEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemRestoredEvent())
                        .projectsV2Item(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2Item");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2ItemRestoredEventBuilder builder =
                GitHubWebhookProjectsV2ItemRestoredEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemRestoredEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
