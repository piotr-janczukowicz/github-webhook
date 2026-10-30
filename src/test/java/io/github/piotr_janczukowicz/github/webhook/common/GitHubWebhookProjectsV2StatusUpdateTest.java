package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2StatusUpdateTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookProjectsV2StatusUpdateBuilder builder = GitHubWebhookProjectsV2StatusUpdateBuilder.builder(
                        CommonCatalogFixtures.webhookProjectsV2StatusUpdate())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookProjectsV2StatusUpdateBuilder builder = GitHubWebhookProjectsV2StatusUpdateBuilder.builder(
                        CommonCatalogFixtures.webhookProjectsV2StatusUpdate())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookProjectsV2StatusUpdateBuilder builder = GitHubWebhookProjectsV2StatusUpdateBuilder.builder(
                        CommonCatalogFixtures.webhookProjectsV2StatusUpdate())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
