package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookEnterpriseTest {

    @Test
    void constructor_shouldThrow_whenAvatarUrlNull() {
        final GitHubWebhookEnterpriseBuilder builder = GitHubWebhookEnterpriseBuilder.builder(
                        CommonCatalogFixtures.webhookEnterprise())
                .avatarUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("avatarUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookEnterpriseBuilder builder = GitHubWebhookEnterpriseBuilder.builder(
                        CommonCatalogFixtures.webhookEnterprise())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookEnterpriseBuilder builder = GitHubWebhookEnterpriseBuilder.builder(
                        CommonCatalogFixtures.webhookEnterprise())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookEnterpriseBuilder builder = GitHubWebhookEnterpriseBuilder.builder(
                        CommonCatalogFixtures.webhookEnterprise())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenSlugNull() {
        final GitHubWebhookEnterpriseBuilder builder = GitHubWebhookEnterpriseBuilder.builder(
                        CommonCatalogFixtures.webhookEnterprise())
                .slug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("slug");
    }
}
