package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipCreatedEvent();
    }
}
