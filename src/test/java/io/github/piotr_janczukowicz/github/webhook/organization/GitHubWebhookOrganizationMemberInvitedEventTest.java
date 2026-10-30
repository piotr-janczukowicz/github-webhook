package io.github.piotr_janczukowicz.github.webhook.organization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationMemberInvitedEventTest {

    @Test
    void constructor_shouldThrow_whenInvitationNull() {
        final GitHubWebhookOrganizationMemberInvitedEventBuilder builder =
                GitHubWebhookOrganizationMemberInvitedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberInvitedEvent())
                        .invitation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("invitation");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookOrganizationMemberInvitedEventBuilder builder =
                GitHubWebhookOrganizationMemberInvitedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberInvitedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookOrganizationMemberInvitedEventBuilder builder =
                GitHubWebhookOrganizationMemberInvitedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberInvitedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
