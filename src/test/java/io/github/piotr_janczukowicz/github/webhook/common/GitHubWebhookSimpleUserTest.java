package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimpleUserTest {

    @Test
    void constructor_shouldThrow_whenAvatarUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .avatarUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("avatarUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenFollowersUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .followersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("followersUrl");
    }

    @Test
    void constructor_shouldThrow_whenFollowingUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .followingUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("followingUrl");
    }

    @Test
    void constructor_shouldThrow_whenGistsUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .gistsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gistsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationsUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .organizationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organizationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReceivedEventsUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .receivedEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("receivedEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReposUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .reposUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reposUrl");
    }

    @Test
    void constructor_shouldThrow_whenStarredUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .starredUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("starredUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionsUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .subscriptionsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookSimpleUserBuilder builder = GitHubWebhookSimpleUserBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleUser())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
