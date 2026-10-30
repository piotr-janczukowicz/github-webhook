package io.github.piotr_janczukowicz.github.webhook.organization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationMemberRemovedEventTest {

    @Test
    void constructor_shouldThrow_whenMembershipNull() {
        final GitHubWebhookOrganizationMemberRemovedEventBuilder builder =
                GitHubWebhookOrganizationMemberRemovedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberRemovedEvent())
                        .membership(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membership");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookOrganizationMemberRemovedEventBuilder builder =
                GitHubWebhookOrganizationMemberRemovedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberRemovedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookOrganizationMemberRemovedEventBuilder builder =
                GitHubWebhookOrganizationMemberRemovedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberRemovedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
