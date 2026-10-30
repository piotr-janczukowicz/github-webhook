package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2StatusUpdateCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2StatusUpdateCreatedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateCreatedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateCreatedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2StatusUpdateNull() {
        final GitHubWebhookProjectsV2StatusUpdateCreatedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateCreatedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateCreatedEvent())
                        .projectsV2StatusUpdate(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2StatusUpdate");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2StatusUpdateCreatedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateCreatedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
