package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationTest {

    @Test
    void constructor_shouldThrow_whenAvatarUrlNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .avatarUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("avatarUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }

    @Test
    void constructor_shouldThrow_whenMembersUrlNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .membersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membersUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPublicMembersUrlNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .publicMembersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("publicMembersUrl");
    }

    @Test
    void constructor_shouldThrow_whenReposUrlNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .reposUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reposUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookOrganizationBuilder builder = GitHubWebhookOrganizationBuilder.builder(
                        RepositoryCatalogFixtures.webhookOrganization())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
