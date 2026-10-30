package io.github.piotr_janczukowicz.github.webhook.organization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookOrganizationDeletedEventBuilder builder =
                GitHubWebhookOrganizationDeletedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationDeletedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookOrganizationDeletedEventBuilder builder =
                GitHubWebhookOrganizationDeletedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationDeletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
