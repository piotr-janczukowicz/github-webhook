package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSponsorshipTierChangedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookSponsorshipTierChangedEventBuilder builder =
                GitHubWebhookSponsorshipTierChangedEventBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipTierChangedEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookSponsorshipTierChangedEventBuilder builder =
                GitHubWebhookSponsorshipTierChangedEventBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipTierChangedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSponsorshipNull() {
        final GitHubWebhookSponsorshipTierChangedEventBuilder builder =
                GitHubWebhookSponsorshipTierChangedEventBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipTierChangedEvent())
                        .sponsorship(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sponsorship");
    }
}
