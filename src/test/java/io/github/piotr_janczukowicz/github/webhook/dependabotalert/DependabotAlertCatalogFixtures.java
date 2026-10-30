package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookAdvisoryVulnerabilityFirstPatchedVersion;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDependabotAlertFixedAlertDependencyPackage;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryReference;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;
import java.util.List;

final class DependabotAlertCatalogFixtures {

    private DependabotAlertCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDependabotAlertAssigneesChangedEvent webhookDependabotAlertAssigneesChangedEvent() {
        return GitHubWebhookDependabotAlertAssigneesChangedEventBuilder.builder()
                .alert(webhookDependabotAlertFixedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDependabotAlertAutoDismissedEvent webhookDependabotAlertAutoDismissedEvent() {
        return GitHubWebhookDependabotAlertAutoDismissedEventBuilder.builder()
                .alert(webhookDependabotAlertFixedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDependabotAlertAutoReopenedEvent webhookDependabotAlertAutoReopenedEvent() {
        return GitHubWebhookDependabotAlertAutoReopenedEventBuilder.builder()
                .alert(webhookDependabotAlertFixedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDependabotAlertCreatedEvent webhookDependabotAlertCreatedEvent() {
        return GitHubWebhookDependabotAlertCreatedEventBuilder.builder()
                .alert(webhookDependabotAlertFixedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDependabotAlertDismissalRequest webhookDependabotAlertDismissalRequest() {
        return GitHubWebhookDependabotAlertDismissalRequestBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .id(1L)
                .requester(webhookDependabotAlertDismissalRequestRequester())
                .status(GitHubWebhookDependabotAlertDismissalRequestStatus.PENDING)
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookDependabotAlertDismissalRequestRequester webhookDependabotAlertDismissalRequestRequester() {
        return GitHubWebhookDependabotAlertDismissalRequestRequesterBuilder.builder()
                .id(1L)
                .login("login")
                .build();
    }

    static GitHubWebhookDependabotAlertDismissedEvent webhookDependabotAlertDismissedEvent() {
        return GitHubWebhookDependabotAlertDismissedEventBuilder.builder()
                .alert(webhookDependabotAlertFixedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDependabotAlertFixedAlert webhookDependabotAlertFixedAlert() {
        return GitHubWebhookDependabotAlertFixedAlertBuilder.builder()
                .assignees(List.of(webhookSimpleUser()))
                .autoDismissedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dependency(webhookDependabotAlertFixedAlertDependency())
                .dismissalRequest(webhookDependabotAlertDismissalRequest())
                .dismissedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissedBy(webhookSimpleUser())
                .dismissedComment("dismissed_comment")
                .dismissedReason(GitHubWebhookDependabotAlertFixedAlertDismissedReason.FIX_STARTED)
                .fixedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .number(1L)
                .securityAdvisory(webhookDependabotAlertFixedAlertSecurityAdvisory())
                .securityVulnerability(webhookDependabotAlertFixedAlertSecurityVulnerability())
                .state(GitHubWebhookDependabotAlertFixedAlertState.AUTO_DISMISSED)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookDependabotAlertFixedAlertDependency webhookDependabotAlertFixedAlertDependency() {
        return GitHubWebhookDependabotAlertFixedAlertDependencyBuilder.builder()
                .manifestPath("manifest_path")
                .packageValue(webhookDependabotAlertFixedAlertDependencyPackage())
                .relationship(GitHubWebhookDependabotAlertFixedAlertDependencyRelationship.UNKNOWN)
                .scope(GitHubWebhookDependabotAlertFixedAlertDependencyScope.DEVELOPMENT)
                .versionRequirement("version_requirement")
                .build();
    }

    static GitHubWebhookDependabotAlertFixedAlertSecurityAdvisory webhookDependabotAlertFixedAlertSecurityAdvisory() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryBuilder.builder()
                .classification(GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification.GENERAL)
                .cveId("cve_id")
                .cvssSeverities(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities())
                .cwes(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe()))
                .description("description")
                .epss(webhookDependabotAlertFixedAlertSecurityAdvisoryEpss())
                .ghsaId("ghsa_id")
                .identifiers(List.of(webhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier()))
                .publishedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .references(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryReference()))
                .severity(GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity.LOW)
                .summary("summary")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .vulnerabilities(List.of(webhookDependabotAlertFixedAlertSecurityVulnerability()))
                .withdrawnAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpss
            webhookDependabotAlertFixedAlertSecurityAdvisoryEpss() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpssBuilder.builder()
                .percentage(1.5)
                .percentile(1.5)
                .build();
    }

    static GitHubWebhookDependabotAlertFixedAlertSecurityVulnerability
            webhookDependabotAlertFixedAlertSecurityVulnerability() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityVulnerabilityBuilder.builder()
                .firstPatchedVersion(webhookAdvisoryVulnerabilityFirstPatchedVersion())
                .packageValue(webhookDependabotAlertFixedAlertDependencyPackage())
                .severity(GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity.LOW)
                .vulnerableVersionRange("vulnerable_version_range")
                .build();
    }

    static GitHubWebhookDependabotAlertFixedEvent webhookDependabotAlertFixedEvent() {
        return GitHubWebhookDependabotAlertFixedEventBuilder.builder()
                .alert(webhookDependabotAlertFixedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDependabotAlertReintroducedEvent webhookDependabotAlertReintroducedEvent() {
        return GitHubWebhookDependabotAlertReintroducedEventBuilder.builder()
                .alert(webhookDependabotAlertFixedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDependabotAlertReopenedEvent webhookDependabotAlertReopenedEvent() {
        return GitHubWebhookDependabotAlertReopenedEventBuilder.builder()
                .alert(webhookDependabotAlertFixedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDependabotAlertWithdrawnAlert webhookDependabotAlertWithdrawnAlert() {
        return GitHubWebhookDependabotAlertWithdrawnAlertBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dependency(webhookDependabotAlertWithdrawnAlertDependency())
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .nodeId("node_id")
                .number(1L)
                .securityAdvisory(webhookDependabotAlertWithdrawnAlertSecurityAdvisory())
                .state(GitHubWebhookDependabotAlertWithdrawnAlertState.WITHDRAWN)
                .url("https://api.github.com/url")
                .withdrawnAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookDependabotAlertWithdrawnAlertDependency webhookDependabotAlertWithdrawnAlertDependency() {
        return GitHubWebhookDependabotAlertWithdrawnAlertDependencyBuilder.builder()
                .manifestPath("manifest_path")
                .packageValue(webhookDependabotAlertFixedAlertDependencyPackage())
                .relationship(GitHubWebhookDependabotAlertFixedAlertDependencyRelationship.UNKNOWN)
                .scope(GitHubWebhookDependabotAlertFixedAlertDependencyScope.DEVELOPMENT)
                .versionRequirement("version_requirement")
                .build();
    }

    static GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisory
            webhookDependabotAlertWithdrawnAlertSecurityAdvisory() {
        return GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisoryBuilder.builder()
                .cveId("cve_id")
                .ghsaId("ghsa_id")
                .build();
    }

    static GitHubWebhookDependabotAlertWithdrawnEvent webhookDependabotAlertWithdrawnEvent() {
        return GitHubWebhookDependabotAlertWithdrawnEventBuilder.builder()
                .alert(webhookDependabotAlertWithdrawnAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
