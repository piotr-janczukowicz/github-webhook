package io.github.piotr_janczukowicz.github.webhook.release;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReleaseAssetTest {

    @Test
    void constructor_shouldThrow_whenBrowserDownloadUrlNull() {
        final GitHubWebhookReleaseAssetBuilder builder = GitHubWebhookReleaseAssetBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseAsset())
                .browserDownloadUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("browserDownloadUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentTypeNull() {
        final GitHubWebhookReleaseAssetBuilder builder = GitHubWebhookReleaseAssetBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseAsset())
                .contentType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentType");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookReleaseAssetBuilder builder = GitHubWebhookReleaseAssetBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseAsset())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookReleaseAssetBuilder builder = GitHubWebhookReleaseAssetBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseAsset())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookReleaseAssetBuilder builder = GitHubWebhookReleaseAssetBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseAsset())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookReleaseAssetBuilder builder = GitHubWebhookReleaseAssetBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseAsset())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookReleaseAssetBuilder builder = GitHubWebhookReleaseAssetBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseAsset())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookReleaseAssetBuilder builder = GitHubWebhookReleaseAssetBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseAsset())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
