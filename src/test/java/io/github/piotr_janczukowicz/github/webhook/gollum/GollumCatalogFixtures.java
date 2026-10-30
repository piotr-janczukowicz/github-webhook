package io.github.piotr_janczukowicz.github.webhook.gollum;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.util.List;

final class GollumCatalogFixtures {

    private GollumCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookGollumEvent webhookGollumEvent() {
        return GitHubWebhookGollumEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .pages(List.of(webhookGollumPage()))
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookGollumPage webhookGollumPage() {
        return GitHubWebhookGollumPageBuilder.builder()
                .action(GitHubWebhookGollumPageAction.CREATED)
                .htmlUrl("https://api.github.com/html_url")
                .pageName("page_name")
                .sha("sha")
                .summary("summary")
                .title("title")
                .build();
    }
}
