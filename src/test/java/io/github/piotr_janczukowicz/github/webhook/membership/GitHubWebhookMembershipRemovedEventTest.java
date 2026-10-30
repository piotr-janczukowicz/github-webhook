package io.github.piotr_janczukowicz.github.webhook.membership;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMembershipRemovedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookMembershipRemovedEventBuilder builder = GitHubWebhookMembershipRemovedEventBuilder.builder(
                        MembershipCatalogFixtures.webhookMembershipRemovedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenScopeNull() {
        final GitHubWebhookMembershipRemovedEventBuilder builder = GitHubWebhookMembershipRemovedEventBuilder.builder(
                        MembershipCatalogFixtures.webhookMembershipRemovedEvent())
                .scope(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("scope");
    }

    @Test
    void constructor_shouldThrow_whenTeamNull() {
        final GitHubWebhookMembershipRemovedEventBuilder builder = GitHubWebhookMembershipRemovedEventBuilder.builder(
                        MembershipCatalogFixtures.webhookMembershipRemovedEvent())
                .team(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("team");
    }
}
