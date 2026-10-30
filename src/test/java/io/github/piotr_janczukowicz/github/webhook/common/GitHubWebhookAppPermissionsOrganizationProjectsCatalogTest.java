package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookAppPermissionsOrganizationProjectsCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAppPermissionsOrganizationProjects.class;
    }

    @Override
    protected String schema() {
        return "webhook-app-permissions-organization-projects-schema.json";
    }
}
