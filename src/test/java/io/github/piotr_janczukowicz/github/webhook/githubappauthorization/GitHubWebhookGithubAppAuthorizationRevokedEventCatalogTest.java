package io.github.piotr_janczukowicz.github.webhook.githubappauthorization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookGithubAppAuthorizationRevokedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookGithubAppAuthorizationRevokedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-github-app-authorization-revoked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-github-app-authorization-revoked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return GithubAppAuthorizationCatalogFixtures.webhookGithubAppAuthorizationRevokedEvent();
    }
}
