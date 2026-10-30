package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2StatusUpdateEditedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2StatusUpdateEditedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateEditedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateEditedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2StatusUpdateNull() {
        final GitHubWebhookProjectsV2StatusUpdateEditedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateEditedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateEditedEvent())
                        .projectsV2StatusUpdate(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2StatusUpdate");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2StatusUpdateEditedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateEditedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateEditedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
