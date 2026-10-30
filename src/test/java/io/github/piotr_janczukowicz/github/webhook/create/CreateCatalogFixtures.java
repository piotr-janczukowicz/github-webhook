package io.github.piotr_janczukowicz.github.webhook.create;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCreateRefType;

final class CreateCatalogFixtures {

    private CreateCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCreateEvent webhookCreateEvent() {
        return GitHubWebhookCreateEventBuilder.builder()
                .description("description")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .masterBranch("master_branch")
                .organization(webhookOrganizationSimple())
                .pusherType("pusher_type")
                .ref("ref")
                .refType(GitHubWebhookCreateRefType.TAG)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
