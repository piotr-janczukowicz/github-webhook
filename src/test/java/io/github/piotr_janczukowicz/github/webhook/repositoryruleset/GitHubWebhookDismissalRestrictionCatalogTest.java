package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRestrictionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRestriction.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-restriction.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-restriction-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookDismissalRestriction();
    }
}
