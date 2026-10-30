package io.github.piotr_janczukowicz.github.webhook.workflowdispatch;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.util.Map;

final class WorkflowDispatchCatalogFixtures {

    private WorkflowDispatchCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookWorkflowDispatchEvent webhookWorkflowDispatchEvent() {
        return GitHubWebhookWorkflowDispatchEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .inputs(Map.of("key", Map.of()))
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .workflow("workflow")
                .build();
    }
}
