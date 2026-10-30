package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipCancelledEvent();
    }
}
