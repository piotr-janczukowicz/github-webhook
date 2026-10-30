package io.github.piotr_janczukowicz.github.webhook.orgblock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrgBlockUnblockedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookOrgBlockUnblockedEventBuilder builder = GitHubWebhookOrgBlockUnblockedEventBuilder.builder(
                        OrgBlockCatalogFixtures.webhookOrgBlockUnblockedEvent())
                .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookOrgBlockUnblockedEventBuilder builder = GitHubWebhookOrgBlockUnblockedEventBuilder.builder(
                        OrgBlockCatalogFixtures.webhookOrgBlockUnblockedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
