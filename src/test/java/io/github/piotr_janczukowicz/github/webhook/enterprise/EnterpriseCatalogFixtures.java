package io.github.piotr_janczukowicz.github.webhook.enterprise;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class EnterpriseCatalogFixtures {

    private EnterpriseCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookEnterpriseAnonymousAccessDisabledEvent webhookEnterpriseAnonymousAccessDisabledEvent() {
        return GitHubWebhookEnterpriseAnonymousAccessDisabledEventBuilder.builder()
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookEnterpriseAnonymousAccessEnabledEvent webhookEnterpriseAnonymousAccessEnabledEvent() {
        return GitHubWebhookEnterpriseAnonymousAccessEnabledEventBuilder.builder()
                .sender(webhookSimpleUser())
                .build();
    }
}
