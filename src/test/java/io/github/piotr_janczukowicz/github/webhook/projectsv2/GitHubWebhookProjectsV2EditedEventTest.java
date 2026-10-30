package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2EditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookProjectsV2EditedEventBuilder builder = GitHubWebhookProjectsV2EditedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2EditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2EditedEventBuilder builder = GitHubWebhookProjectsV2EditedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2EditedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2Null() {
        final GitHubWebhookProjectsV2EditedEventBuilder builder = GitHubWebhookProjectsV2EditedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2EditedEvent())
                .projectsV2(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2EditedEventBuilder builder = GitHubWebhookProjectsV2EditedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2EditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
