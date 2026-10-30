package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenMembersUrlNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .membersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membersUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPermissionNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .permission(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permission");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesUrlNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .repositoriesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSlugNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .slug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("slug");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookTeamBuilder builder = GitHubWebhookTeamBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookTeam())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
