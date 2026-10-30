package io.github.piotr_janczukowicz.github.webhook.membership;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTeamParentTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenMembersUrlNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .membersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membersUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationSettingNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .notificationSetting(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationSetting");
    }

    @Test
    void constructor_shouldThrow_whenPermissionNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .permission(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permission");
    }

    @Test
    void constructor_shouldThrow_whenPrivacyNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .privacy(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("privacy");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesUrlNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .repositoriesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSlugNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .slug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("slug");
    }

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookTeamParentBuilder builder = GitHubWebhookTeamParentBuilder.builder(
                        MembershipCatalogFixtures.webhookTeamParent())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
