package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamSimpleTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenMembersUrlNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .membersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membersUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPermissionNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .permission(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permission");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesUrlNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .repositoriesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSlugNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .slug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("slug");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookTeamSimpleBuilder builder = GitHubWebhookTeamSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookTeamSimple())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
