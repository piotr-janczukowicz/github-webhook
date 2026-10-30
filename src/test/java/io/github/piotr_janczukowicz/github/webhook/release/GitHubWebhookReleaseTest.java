package io.github.piotr_janczukowicz.github.webhook.release;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReleaseTest {

    @Test
    void constructor_shouldThrow_whenAssetsNull() {
        final GitHubWebhookReleaseBuilder builder = GitHubWebhookReleaseBuilder.builder(
                        ReleaseCatalogFixtures.webhookRelease())
                .assets(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assets");
    }

    @Test
    void constructor_shouldThrow_whenAssetsUrlNull() {
        final GitHubWebhookReleaseBuilder builder = GitHubWebhookReleaseBuilder.builder(
                        ReleaseCatalogFixtures.webhookRelease())
                .assetsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assetsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookReleaseBuilder builder = GitHubWebhookReleaseBuilder.builder(
                        ReleaseCatalogFixtures.webhookRelease())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookReleaseBuilder builder = GitHubWebhookReleaseBuilder.builder(
                        ReleaseCatalogFixtures.webhookRelease())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenTagNameNull() {
        final GitHubWebhookReleaseBuilder builder = GitHubWebhookReleaseBuilder.builder(
                        ReleaseCatalogFixtures.webhookRelease())
                .tagName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagName");
    }

    @Test
    void constructor_shouldThrow_whenTargetCommitishNull() {
        final GitHubWebhookReleaseBuilder builder = GitHubWebhookReleaseBuilder.builder(
                        ReleaseCatalogFixtures.webhookRelease())
                .targetCommitish(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetCommitish");
    }

    @Test
    void constructor_shouldThrow_whenUploadUrlNull() {
        final GitHubWebhookReleaseBuilder builder = GitHubWebhookReleaseBuilder.builder(
                        ReleaseCatalogFixtures.webhookRelease())
                .uploadUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("uploadUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookReleaseBuilder builder = GitHubWebhookReleaseBuilder.builder(
                        ReleaseCatalogFixtures.webhookRelease())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
