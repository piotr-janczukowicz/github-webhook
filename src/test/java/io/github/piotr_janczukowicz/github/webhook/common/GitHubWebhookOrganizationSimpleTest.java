package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationSimpleTest {

    @Test
    void constructor_shouldThrow_whenAvatarUrlNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .avatarUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("avatarUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }

    @Test
    void constructor_shouldThrow_whenMembersUrlNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .membersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membersUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPublicMembersUrlNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .publicMembersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("publicMembersUrl");
    }

    @Test
    void constructor_shouldThrow_whenReposUrlNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .reposUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reposUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookOrganizationSimpleBuilder builder = GitHubWebhookOrganizationSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookOrganizationSimple())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
