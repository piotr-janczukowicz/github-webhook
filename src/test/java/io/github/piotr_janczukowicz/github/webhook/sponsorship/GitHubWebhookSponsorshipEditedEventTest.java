package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSponsorshipEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookSponsorshipEditedEventBuilder builder = GitHubWebhookSponsorshipEditedEventBuilder.builder(
                        SponsorshipCatalogFixtures.webhookSponsorshipEditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookSponsorshipEditedEventBuilder builder = GitHubWebhookSponsorshipEditedEventBuilder.builder(
                        SponsorshipCatalogFixtures.webhookSponsorshipEditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSponsorshipNull() {
        final GitHubWebhookSponsorshipEditedEventBuilder builder = GitHubWebhookSponsorshipEditedEventBuilder.builder(
                        SponsorshipCatalogFixtures.webhookSponsorshipEditedEvent())
                .sponsorship(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sponsorship");
    }
}
