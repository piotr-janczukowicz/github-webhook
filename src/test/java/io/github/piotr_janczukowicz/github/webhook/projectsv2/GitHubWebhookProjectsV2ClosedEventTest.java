package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ClosedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2ClosedEventBuilder builder = GitHubWebhookProjectsV2ClosedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2ClosedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2Null() {
        final GitHubWebhookProjectsV2ClosedEventBuilder builder = GitHubWebhookProjectsV2ClosedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2ClosedEvent())
                .projectsV2(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2ClosedEventBuilder builder = GitHubWebhookProjectsV2ClosedEventBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2ClosedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
