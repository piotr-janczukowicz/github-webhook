package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookProjectsV2ItemCreatedEventBuilder builder =
                GitHubWebhookProjectsV2ItemCreatedEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemCreatedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenProjectsV2ItemNull() {
        final GitHubWebhookProjectsV2ItemCreatedEventBuilder builder =
                GitHubWebhookProjectsV2ItemCreatedEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemCreatedEvent())
                        .projectsV2Item(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectsV2Item");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectsV2ItemCreatedEventBuilder builder =
                GitHubWebhookProjectsV2ItemCreatedEventBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
