package io.github.piotr_janczukowicz.github.webhook.membership;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMembershipAddedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookMembershipAddedEventBuilder builder = GitHubWebhookMembershipAddedEventBuilder.builder(
                        MembershipCatalogFixtures.webhookMembershipAddedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenScopeNull() {
        final GitHubWebhookMembershipAddedEventBuilder builder = GitHubWebhookMembershipAddedEventBuilder.builder(
                        MembershipCatalogFixtures.webhookMembershipAddedEvent())
                .scope(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("scope");
    }

    @Test
    void constructor_shouldThrow_whenTeamNull() {
        final GitHubWebhookMembershipAddedEventBuilder builder = GitHubWebhookMembershipAddedEventBuilder.builder(
                        MembershipCatalogFixtures.webhookMembershipAddedEvent())
                .team(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("team");
    }
}
