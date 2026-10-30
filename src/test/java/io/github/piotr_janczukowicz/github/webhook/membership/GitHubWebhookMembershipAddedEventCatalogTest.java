package io.github.piotr_janczukowicz.github.webhook.membership;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMembershipAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMembershipAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-membership-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-membership-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MembershipCatalogFixtures.webhookMembershipAddedEvent();
    }
}
