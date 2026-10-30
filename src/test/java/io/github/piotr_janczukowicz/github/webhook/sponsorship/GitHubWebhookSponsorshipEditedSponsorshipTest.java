package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSponsorshipEditedSponsorshipTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookSponsorshipEditedSponsorshipBuilder builder =
                GitHubWebhookSponsorshipEditedSponsorshipBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipEditedSponsorship())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSponsorshipEditedSponsorshipBuilder builder =
                GitHubWebhookSponsorshipEditedSponsorshipBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipEditedSponsorship())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPrivacyLevelNull() {
        final GitHubWebhookSponsorshipEditedSponsorshipBuilder builder =
                GitHubWebhookSponsorshipEditedSponsorshipBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipEditedSponsorship())
                        .privacyLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("privacyLevel");
    }

    @Test
    void constructor_shouldThrow_whenTierNull() {
        final GitHubWebhookSponsorshipEditedSponsorshipBuilder builder =
                GitHubWebhookSponsorshipEditedSponsorshipBuilder.builder(
                                SponsorshipCatalogFixtures.webhookSponsorshipEditedSponsorship())
                        .tier(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tier");
    }
}
