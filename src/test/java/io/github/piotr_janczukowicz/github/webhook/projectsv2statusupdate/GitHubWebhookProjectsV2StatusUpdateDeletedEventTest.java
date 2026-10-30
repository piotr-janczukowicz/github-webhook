package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2StatusUpdateDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2StatusUpdateDeletedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateDeletedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateDeletedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2StatusUpdateNull() {
        final GitHubWebhookProjectsV2StatusUpdateDeletedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateDeletedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateDeletedEvent())
                        .projectsV2StatusUpdate(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2StatusUpdate");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2StatusUpdateDeletedEventBuilder builder =
                GitHubWebhookProjectsV2StatusUpdateDeletedEventBuilder.builder(
                                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateDeletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
