package io.github.piotr_janczukowicz.github.webhook.orgblock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrgBlockBlockedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookOrgBlockBlockedEventBuilder builder = GitHubWebhookOrgBlockBlockedEventBuilder.builder(
                        OrgBlockCatalogFixtures.webhookOrgBlockBlockedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookOrgBlockBlockedEventBuilder builder = GitHubWebhookOrgBlockBlockedEventBuilder.builder(
                        OrgBlockCatalogFixtures.webhookOrgBlockBlockedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
