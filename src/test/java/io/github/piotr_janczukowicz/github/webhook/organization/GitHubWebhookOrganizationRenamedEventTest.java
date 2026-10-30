package io.github.piotr_janczukowicz.github.webhook.organization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationRenamedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookOrganizationRenamedEventBuilder builder =
                GitHubWebhookOrganizationRenamedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationRenamedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookOrganizationRenamedEventBuilder builder =
                GitHubWebhookOrganizationRenamedEventBuilder.builder(
                                OrganizationCatalogFixtures.webhookOrganizationRenamedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
