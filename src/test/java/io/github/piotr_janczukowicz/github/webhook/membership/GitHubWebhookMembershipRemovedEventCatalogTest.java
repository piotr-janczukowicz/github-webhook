package io.github.piotr_janczukowicz.github.webhook.membership;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMembershipRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMembershipRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-membership-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-membership-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MembershipCatalogFixtures.webhookMembershipRemovedEvent();
    }
}
