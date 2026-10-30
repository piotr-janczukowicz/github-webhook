package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookAppPermissionsOrganizationCopilotRequestsCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAppPermissionsOrganizationCopilotRequests.class;
    }

    @Override
    protected String schema() {
        return "webhook-app-permissions-organization-copilot-requests-schema.json";
    }
}
