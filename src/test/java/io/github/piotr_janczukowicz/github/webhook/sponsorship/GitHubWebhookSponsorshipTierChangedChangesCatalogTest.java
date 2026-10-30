package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipTierChangedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipTierChangedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-tier-changed-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-tier-changed-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipTierChangedChanges();
    }
}
