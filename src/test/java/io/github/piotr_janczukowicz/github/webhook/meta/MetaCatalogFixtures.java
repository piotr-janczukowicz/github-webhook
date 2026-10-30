package io.github.piotr_janczukowicz.github.webhook.meta;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.util.List;

final class MetaCatalogFixtures {

    private MetaCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookMetaDeletedEvent webhookMetaDeletedEvent() {
        return GitHubWebhookMetaDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .hook(webhookMetaDeletedHook())
                .hookId(1L)
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMetaDeletedHook webhookMetaDeletedHook() {
        return GitHubWebhookMetaDeletedHookBuilder.builder()
                .active(true)
                .config(webhookMetaDeletedHookConfig())
                .createdAt("created_at")
                .events(List.of(GitHubWebhookMetaDeletedHookEvent.EMPTY))
                .id(1L)
                .name("name")
                .type("type")
                .updatedAt("updated_at")
                .build();
    }

    static GitHubWebhookMetaDeletedHookConfig webhookMetaDeletedHookConfig() {
        return GitHubWebhookMetaDeletedHookConfigBuilder.builder()
                .contentType(GitHubWebhookMetaDeletedHookConfigContentType.JSON)
                .insecureSsl("insecure_ssl")
                .secret("secret")
                .url("https://api.github.com/url")
                .build();
    }
}
