package io.github.piotr_janczukowicz.github.webhook.organization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationMemberAddedEventTest {

    @Test
    void constructor_shouldThrow_whenMembershipNull() {
        final GitHubWebhookOrganizationMemberAddedEventBuilder builder =
                GitHubWebhookOrganizationMemberAddedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberAddedEvent())
                        .membership(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membership");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookOrganizationMemberAddedEventBuilder builder =
                GitHubWebhookOrganizationMemberAddedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberAddedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookOrganizationMemberAddedEventBuilder builder =
                GitHubWebhookOrganizationMemberAddedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationMemberAddedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
