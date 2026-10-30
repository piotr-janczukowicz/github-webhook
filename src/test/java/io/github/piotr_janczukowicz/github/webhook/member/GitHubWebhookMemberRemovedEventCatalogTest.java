package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMemberRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-member-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-member-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MemberCatalogFixtures.webhookMemberRemovedEvent();
    }
}
