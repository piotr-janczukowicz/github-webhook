package io.github.piotr_janczukowicz.github.webhook.milestone;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMilestoneOpenedMilestoneTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookMilestoneOpenedMilestoneBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookMilestoneOpenedMilestoneBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookMilestoneOpenedMilestoneBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookMilestoneOpenedMilestoneBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookMilestoneOpenedMilestoneBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookMilestoneOpenedMilestoneBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookMilestoneOpenedMilestoneBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookMilestoneOpenedMilestoneBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
