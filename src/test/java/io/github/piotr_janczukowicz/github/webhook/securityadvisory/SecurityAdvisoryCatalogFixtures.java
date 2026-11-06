package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookAdvisoryVulnerabilityFirstPatchedVersion;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDependabotAlertFixedAlertDependencyPackage;
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

final class SecurityAdvisoryCatalogFixtures {

    private SecurityAdvisoryCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookSecurityAdvisoryPublishedEvent webhookSecurityAdvisoryPublishedEvent() {
        return GitHubWebhookSecurityAdvisoryPublishedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .securityAdvisory(webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecurityAdvisoryUpdatedEvent webhookSecurityAdvisoryUpdatedEvent() {
        return GitHubWebhookSecurityAdvisoryUpdatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .securityAdvisory(webhookSecurityAdvisoryUpdatedSecurityAdvisory())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisory webhookSecurityAdvisoryUpdatedSecurityAdvisory() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryBuilder.builder()
                .cvssSeverities(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities())
                .cwes(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe()))
                .description("description")
                .ghsaId("ghsa_id")
                .identifiers(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier()))
                .publishedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .references(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryReference()))
                .severity("severity")
                .summary("summary")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .vulnerabilities(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryVulnerability()))
                .withdrawnAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier
            webhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifierBuilder.builder()
                .type("type")
                .value("value")
                .build();
    }

    static GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryVulnerability
            webhookSecurityAdvisoryUpdatedSecurityAdvisoryVulnerability() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryVulnerabilityBuilder.builder()
                .firstPatchedVersion(webhookAdvisoryVulnerabilityFirstPatchedVersion())
                .packageValue(webhookDependabotAlertFixedAlertDependencyPackage())
                .severity("severity")
                .vulnerableVersionRange("vulnerable_version_range")
                .build();
    }

    static GitHubWebhookSecurityAdvisoryWithdrawnEvent webhookSecurityAdvisoryWithdrawnEvent() {
        return GitHubWebhookSecurityAdvisoryWithdrawnEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .securityAdvisory(webhookSecurityAdvisoryWithdrawnSecurityAdvisory())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisory webhookSecurityAdvisoryWithdrawnSecurityAdvisory() {
        return GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryBuilder.builder()
                .cvssSeverities(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities())
                .cwes(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe()))
                .description("description")
                .ghsaId("ghsa_id")
                .identifiers(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier()))
                .publishedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .references(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryReference()))
                .severity("severity")
                .summary("summary")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .vulnerabilities(List.of(webhookSecurityAdvisoryUpdatedSecurityAdvisoryVulnerability()))
                .withdrawnAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }
}
