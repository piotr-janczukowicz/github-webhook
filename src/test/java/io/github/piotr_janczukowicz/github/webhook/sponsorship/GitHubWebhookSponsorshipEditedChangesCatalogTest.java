package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipEditedChanges();
    }
}
