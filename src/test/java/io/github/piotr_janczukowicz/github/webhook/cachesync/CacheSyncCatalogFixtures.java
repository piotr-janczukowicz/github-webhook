package io.github.piotr_janczukowicz.github.webhook.cachesync;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class CacheSyncCatalogFixtures {

    private CacheSyncCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCacheSyncEvent webhookCacheSyncEvent() {
        return GitHubWebhookCacheSyncEventBuilder.builder()
                .after("after")
                .before("before")
                .cacheLocation("cache_location")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .ref("ref")
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
