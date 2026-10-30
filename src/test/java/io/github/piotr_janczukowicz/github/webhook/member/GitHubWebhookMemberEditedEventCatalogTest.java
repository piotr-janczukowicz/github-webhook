package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMemberEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-member-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-member-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MemberCatalogFixtures.webhookMemberEditedEvent();
    }
}
