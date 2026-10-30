package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipTierChangedChangesTierCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipTierChangedChangesTier.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-tier-changed-changes-tier.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-tier-changed-changes-tier-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipTierChangedChangesTier();
    }
}
