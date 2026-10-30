package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSponsorshipEditedSponsorshipCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSponsorshipEditedSponsorship.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sponsorship-edited-sponsorship.json";
    }

    @Override
    protected String schema() {
        return "webhook-sponsorship-edited-sponsorship-schema.json";
    }

    @Override
    protected Object expected() {
        return SponsorshipCatalogFixtures.webhookSponsorshipEditedSponsorship();
    }
}
