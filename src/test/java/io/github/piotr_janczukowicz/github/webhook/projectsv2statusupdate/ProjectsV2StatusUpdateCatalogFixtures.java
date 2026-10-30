package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookMemberEditedChangesPermission;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookProjectsV2StatusUpdate;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectsV2StatusUpdateStatus;

final class ProjectsV2StatusUpdateCatalogFixtures {

    private ProjectsV2StatusUpdateCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookProjectsV2StatusUpdateCreatedEvent webhookProjectsV2StatusUpdateCreatedEvent() {
        return GitHubWebhookProjectsV2StatusUpdateCreatedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2StatusUpdate(webhookProjectsV2StatusUpdate())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2StatusUpdateDeletedEvent webhookProjectsV2StatusUpdateDeletedEvent() {
        return GitHubWebhookProjectsV2StatusUpdateDeletedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2StatusUpdate(webhookProjectsV2StatusUpdate())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2StatusUpdateEditedChanges webhookProjectsV2StatusUpdateEditedChanges() {
        return GitHubWebhookProjectsV2StatusUpdateEditedChangesBuilder.builder()
                .body(webhookMemberEditedChangesPermission())
                .startDate(webhookMemberEditedChangesPermission())
                .status(webhookProjectsV2StatusUpdateEditedChangesStatus())
                .targetDate(webhookMemberEditedChangesPermission())
                .build();
    }

    static GitHubWebhookProjectsV2StatusUpdateEditedChangesStatus webhookProjectsV2StatusUpdateEditedChangesStatus() {
        return GitHubWebhookProjectsV2StatusUpdateEditedChangesStatusBuilder.builder()
                .from(GitHubWebhookProjectsV2StatusUpdateStatus.INACTIVE)
                .to(GitHubWebhookProjectsV2StatusUpdateStatus.INACTIVE)
                .build();
    }

    static GitHubWebhookProjectsV2StatusUpdateEditedEvent webhookProjectsV2StatusUpdateEditedEvent() {
        return GitHubWebhookProjectsV2StatusUpdateEditedEventBuilder.builder()
                .changes(webhookProjectsV2StatusUpdateEditedChanges())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2StatusUpdate(webhookProjectsV2StatusUpdate())
                .sender(webhookSimpleUser())
                .build();
    }
}
