package io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentProtectionRuleRequestedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentProtectionRuleRequestedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-protection-rule-requested-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-protection-rule-requested-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentProtectionRuleCatalogFixtures.webhookDeploymentProtectionRuleRequestedEvent();
    }
}
