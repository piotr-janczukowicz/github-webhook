package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSponsorshipCancelledEventTest {

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookSponsorshipCancelledEventBuilder builder =
                GitHubWebhookSponsorshipCancelledEventBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipCancelledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSponsorshipNull() {
        final GitHubWebhookSponsorshipCancelledEventBuilder builder =
                GitHubWebhookSponsorshipCancelledEventBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipCancelledEvent())
                        .sponsorship(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sponsorship");
    }
}
