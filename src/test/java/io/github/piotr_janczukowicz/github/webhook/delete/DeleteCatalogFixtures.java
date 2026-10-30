package io.github.piotr_janczukowicz.github.webhook.delete;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCreateRefType;

final class DeleteCatalogFixtures {

    private DeleteCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDeleteEvent webhookDeleteEvent() {
        return GitHubWebhookDeleteEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .pusherType("pusher_type")
                .ref("ref")
                .refType(GitHubWebhookCreateRefType.TAG)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
