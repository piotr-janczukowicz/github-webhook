package io.github.piotr_janczukowicz.github.webhook.teamadd;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamNotificationSetting;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamPrivacy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamType;

final class TeamAddCatalogFixtures {

    private TeamAddCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookTeam webhookTeam() {
        return GitHubWebhookTeamBuilder.builder()
                .deleted(true)
                .description("description")
                .enterpriseId(42L)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .membersUrl("https://api.github.com/members_url{/id}")
                .name("name")
                .nodeId("node_id")
                .notificationSetting(GitHubWebhookTeamNotificationSetting.NOTIFICATIONS_ENABLED)
                .organizationId(37L)
                .parent(webhookTeamParent())
                .permission("permission")
                .privacy(GitHubWebhookTeamPrivacy.OPEN)
                .repositoriesUrl("https://api.github.com/repositories_url")
                .slug("slug")
                .type(GitHubWebhookTeamType.ENTERPRISE)
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookTeamAddEvent webhookTeamAddEvent() {
        return GitHubWebhookTeamAddEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .team(webhookTeam())
                .build();
    }

    static GitHubWebhookTeamParent webhookTeamParent() {
        return GitHubWebhookTeamParentBuilder.builder()
                .description("description")
                .enterpriseId(42L)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .membersUrl("https://api.github.com/members_url{/id}")
                .name("name")
                .nodeId("node_id")
                .notificationSetting(GitHubWebhookTeamNotificationSetting.NOTIFICATIONS_ENABLED)
                .organizationId(37L)
                .permission("permission")
                .privacy(GitHubWebhookTeamPrivacy.OPEN)
                .repositoriesUrl("https://api.github.com/repositories_url")
                .slug("slug")
                .type(GitHubWebhookTeamType.ENTERPRISE)
                .url("https://api.github.com/url")
                .build();
    }
}
