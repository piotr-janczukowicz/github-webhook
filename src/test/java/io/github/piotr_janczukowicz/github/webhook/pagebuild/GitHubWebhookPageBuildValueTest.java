package io.github.piotr_janczukowicz.github.webhook.pagebuild;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPageBuildValueTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPageBuildValueBuilder builder = GitHubWebhookPageBuildValueBuilder.builder(
                        PageBuildCatalogFixtures.webhookPageBuildValue())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenErrorNull() {
        final GitHubWebhookPageBuildValueBuilder builder = GitHubWebhookPageBuildValueBuilder.builder(
                        PageBuildCatalogFixtures.webhookPageBuildValue())
                .error(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("error");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookPageBuildValueBuilder builder = GitHubWebhookPageBuildValueBuilder.builder(
                        PageBuildCatalogFixtures.webhookPageBuildValue())
                .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPageBuildValueBuilder builder = GitHubWebhookPageBuildValueBuilder.builder(
                        PageBuildCatalogFixtures.webhookPageBuildValue())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPageBuildValueBuilder builder = GitHubWebhookPageBuildValueBuilder.builder(
                        PageBuildCatalogFixtures.webhookPageBuildValue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
