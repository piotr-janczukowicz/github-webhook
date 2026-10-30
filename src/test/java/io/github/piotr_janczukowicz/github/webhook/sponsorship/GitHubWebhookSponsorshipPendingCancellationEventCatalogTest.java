package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipPendingCancellationEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipPendingCancellationEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-pending-cancellation-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-pending-cancellation-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipPendingCancellationEvent();
    }
}
