package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSponsorshipPendingTierChangeEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookSponsorshipPendingTierChangeEventBuilder builder =
                GitHubWebhookSponsorshipPendingTierChangeEventBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipPendingTierChangeEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookSponsorshipPendingTierChangeEventBuilder builder =
                GitHubWebhookSponsorshipPendingTierChangeEventBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipPendingTierChangeEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSponsorshipNull() {
        final GitHubWebhookSponsorshipPendingTierChangeEventBuilder builder =
                GitHubWebhookSponsorshipPendingTierChangeEventBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipPendingTierChangeEvent())
                        .sponsorship(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sponsorship");
    }
}
