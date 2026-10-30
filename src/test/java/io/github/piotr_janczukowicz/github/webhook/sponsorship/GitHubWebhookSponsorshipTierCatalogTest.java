package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipTierCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipTier.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-tier.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-tier-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipTier();
    }
}
