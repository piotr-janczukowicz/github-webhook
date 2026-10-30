package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReference;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Details for the GitHub Security Advisory.
 *
 * @param classification The classification of the advisory.
 * @param cveId The unique CVE ID assigned to the advisory.
 * @param cvssSeverities cvss_severities
 * @param cwes Details for the advisory pertaining to Common Weakness Enumeration.
 * @param description A long-form Markdown-supported description of the advisory.
 * @param epss The EPSS scores as calculated by the [Exploit Prediction Scoring System](https://www.first.org/epss).
 * @param ghsaId The unique GitHub Security Advisory ID assigned to the advisory.
 * @param identifiers Values that identify this advisory among security information sources.
 * @param publishedAt The time that the advisory was published in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param references Links to additional advisory information.
 * @param severity The severity of the advisory.
 * @param summary A short, plain text summary of the advisory.
 * @param updatedAt The time that the advisory was last modified in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param vulnerabilities Vulnerable version range information for the advisory.
 * @param withdrawnAt The time that the advisory was withdrawn in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory")
public record GitHubWebhookDependabotAlertFixedAlertSecurityAdvisory(
        @Nullable GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification classification,
        @Nullable String cveId,
        @Nullable GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities cvssSeverities,
        List<GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe> cwes,
        String description,
        @Nullable GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpss epss,
        String ghsaId,
        List<GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier> identifiers,
        Instant publishedAt,
        List<GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReference> references,
        GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity severity,
        String summary,
        Instant updatedAt,
        List<GitHubWebhookDependabotAlertFixedAlertSecurityVulnerability> vulnerabilities,
        @Nullable Instant withdrawnAt) {
    public GitHubWebhookDependabotAlertFixedAlertSecurityAdvisory {
        requireNonNull(cwes, "cwes");
        requireNonNull(description, "description");
        requireNonNull(ghsaId, "ghsaId");
        requireNonNull(identifiers, "identifiers");
        requireNonNull(publishedAt, "publishedAt");
        requireNonNull(references, "references");
        requireNonNull(severity, "severity");
        requireNonNull(summary, "summary");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(vulnerabilities, "vulnerabilities");
    }
}
