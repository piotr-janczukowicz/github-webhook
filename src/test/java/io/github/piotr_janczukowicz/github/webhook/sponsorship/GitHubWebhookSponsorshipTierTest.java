package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSponsorshipTierTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookSponsorshipTierBuilder builder = GitHubWebhookSponsorshipTierBuilder.builder(
                        SponsorshipCatalogFixtures.webhookSponsorshipTier())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookSponsorshipTierBuilder builder = GitHubWebhookSponsorshipTierBuilder.builder(
                        SponsorshipCatalogFixtures.webhookSponsorshipTier())
                .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookSponsorshipTierBuilder builder = GitHubWebhookSponsorshipTierBuilder.builder(
                        SponsorshipCatalogFixtures.webhookSponsorshipTier())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSponsorshipTierBuilder builder = GitHubWebhookSponsorshipTierBuilder.builder(
                        SponsorshipCatalogFixtures.webhookSponsorshipTier())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
