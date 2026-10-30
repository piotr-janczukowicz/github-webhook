package io.github.piotr_janczukowicz.github.webhook.gollum;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookGollumPageTest {

    @Test
    void constructor_shouldThrow_whenActionNull() {
        final GitHubWebhookGollumPageBuilder builder = GitHubWebhookGollumPageBuilder.builder(
                        GollumCatalogFixtures.webhookGollumPage())
                .action(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("action");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookGollumPageBuilder builder = GitHubWebhookGollumPageBuilder.builder(
                        GollumCatalogFixtures.webhookGollumPage())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenPageNameNull() {
        final GitHubWebhookGollumPageBuilder builder = GitHubWebhookGollumPageBuilder.builder(
                        GollumCatalogFixtures.webhookGollumPage())
                .pageName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pageName");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookGollumPageBuilder builder = GitHubWebhookGollumPageBuilder.builder(
                        GollumCatalogFixtures.webhookGollumPage())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookGollumPageBuilder builder = GitHubWebhookGollumPageBuilder.builder(
                        GollumCatalogFixtures.webhookGollumPage())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }
}
