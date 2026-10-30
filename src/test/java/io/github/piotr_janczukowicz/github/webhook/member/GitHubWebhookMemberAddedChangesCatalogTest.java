package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMemberAddedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberAddedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-member-added-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-member-added-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return MemberCatalogFixtures.webhookMemberAddedChanges();
    }
}
