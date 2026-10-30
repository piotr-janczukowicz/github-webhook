package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerTest {

    @Test
    void constructor_shouldThrow_whenAvatarUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .avatarUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("avatarUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenFollowersUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .followersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("followersUrl");
    }

    @Test
    void constructor_shouldThrow_whenFollowingUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .followingUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("followingUrl");
    }

    @Test
    void constructor_shouldThrow_whenGistsUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .gistsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gistsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGravatarIdNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .gravatarId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gravatarId");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationsUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .organizationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organizationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReceivedEventsUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .receivedEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("receivedEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReposUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .reposUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reposUrl");
    }

    @Test
    void constructor_shouldThrow_whenStarredUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .starredUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("starredUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionsUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .subscriptionsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder builder =
                GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerBuilder.builder(
                                RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
