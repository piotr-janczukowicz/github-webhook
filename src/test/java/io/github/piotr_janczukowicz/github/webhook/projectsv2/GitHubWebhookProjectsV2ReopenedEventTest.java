package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ReopenedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2ReopenedEventBuilder builder = GitHubWebhookProjectsV2ReopenedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2ReopenedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2Null() {
        final GitHubWebhookProjectsV2ReopenedEventBuilder builder = GitHubWebhookProjectsV2ReopenedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2ReopenedEvent())
                .projectsV2(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2ReopenedEventBuilder builder = GitHubWebhookProjectsV2ReopenedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2ReopenedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
