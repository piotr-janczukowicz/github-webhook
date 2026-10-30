package io.github.piotr_janczukowicz.github.webhook.organization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMembershipTest {

    @Test
    void constructor_shouldThrow_whenOrganizationUrlNull() {
        final GitHubWebhookMembershipBuilder builder = GitHubWebhookMembershipBuilder.builder(
                        OrganizationCatalogFixtures.webhookMembership())
                .organizationUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organizationUrl");
    }

    @Test
    void constructor_shouldThrow_whenRoleNull() {
        final GitHubWebhookMembershipBuilder builder = GitHubWebhookMembershipBuilder.builder(
                        OrganizationCatalogFixtures.webhookMembership())
                .role(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("role");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookMembershipBuilder builder = GitHubWebhookMembershipBuilder.builder(
                        OrganizationCatalogFixtures.webhookMembership())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookMembershipBuilder builder = GitHubWebhookMembershipBuilder.builder(
                        OrganizationCatalogFixtures.webhookMembership())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
