package io.github.piotr_janczukowicz.github.webhook.deploykey;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class DeployKeyCatalogFixtures {

    private DeployKeyCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDeployKeyCreatedEvent webhookDeployKeyCreatedEvent() {
        return GitHubWebhookDeployKeyCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .key(webhookDeployKeyCreatedKey())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDeployKeyCreatedKey webhookDeployKeyCreatedKey() {
        return GitHubWebhookDeployKeyCreatedKeyBuilder.builder()
                .addedBy("added_by")
                .createdAt("created_at")
                .enabled(true)
                .id(1L)
                .key("key")
                .lastUsed("last_used")
                .readOnly(true)
                .title("title")
                .url("https://api.github.com/url")
                .verified(true)
                .build();
    }

    static GitHubWebhookDeployKeyDeletedEvent webhookDeployKeyDeletedEvent() {
        return GitHubWebhookDeployKeyDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .key(webhookDeployKeyCreatedKey())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
