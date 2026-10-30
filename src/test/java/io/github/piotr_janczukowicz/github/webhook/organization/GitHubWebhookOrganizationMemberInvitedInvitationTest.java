package io.github.piotr_janczukowicz.github.webhook.organization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationMemberInvitedInvitationTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookOrganizationMemberInvitedInvitationBuilder builder =
                GitHubWebhookOrganizationMemberInvitedInvitationBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberInvitedInvitation())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenInvitationTeamsUrlNull() {
        final GitHubWebhookOrganizationMemberInvitedInvitationBuilder builder =
                GitHubWebhookOrganizationMemberInvitedInvitationBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberInvitedInvitation())
                        .invitationTeamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("invitationTeamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookOrganizationMemberInvitedInvitationBuilder builder =
                GitHubWebhookOrganizationMemberInvitedInvitationBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberInvitedInvitation())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenRoleNull() {
        final GitHubWebhookOrganizationMemberInvitedInvitationBuilder builder =
                GitHubWebhookOrganizationMemberInvitedInvitationBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberInvitedInvitation())
                        .role(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("role");
    }
}
