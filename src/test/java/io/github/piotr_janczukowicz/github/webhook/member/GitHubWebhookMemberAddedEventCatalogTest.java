package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMemberAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-member-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-member-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MemberCatalogFixtures.webhookMemberAddedEvent();
    }
}
