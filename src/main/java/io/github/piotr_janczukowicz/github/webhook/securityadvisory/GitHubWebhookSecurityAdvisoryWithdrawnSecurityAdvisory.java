package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReference;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The details of the security advisory, including summary, description, and severity.
 *
 * @param cvssSeverities cvss_severities
 * @param cwes cwes
 * @param description description
 * @param ghsaId ghsa_id
 * @param identifiers identifiers
 * @param publishedAt published_at
 * @param references references
 * @param severity severity
 * @param summary summary
 * @param updatedAt updated_at
 * @param vulnerabilities vulnerabilities
 * @param withdrawnAt withdrawn_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/security-advisory-withdrawn/requestBody/properties/security_advisory")
public record GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisory(
        @Nullable GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities cvssSeverities,
        List<GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe> cwes,
        String description,
        String ghsaId,
        List<GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier> identifiers,
        String publishedAt,
        List<GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReference> references,
        String severity,
        String summary,
        String updatedAt,
        List<GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryVulnerability> vulnerabilities,
        String withdrawnAt) {
    public GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisory {
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
        requireNonNull(withdrawnAt, "withdrawnAt");
    }
}
