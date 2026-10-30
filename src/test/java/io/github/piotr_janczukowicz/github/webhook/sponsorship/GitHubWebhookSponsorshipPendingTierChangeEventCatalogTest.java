package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipPendingTierChangeEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipPendingTierChangeEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-pending-tier-change-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-pending-tier-change-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipPendingTierChangeEvent();
    }
}
