package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMemberEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-member-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-member-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return MemberCatalogFixtures.webhookMemberEditedChanges();
    }
}
