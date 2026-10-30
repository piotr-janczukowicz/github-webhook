package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipTierChangedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipTierChangedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-tier-changed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-tier-changed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipTierChangedEvent();
    }
}
