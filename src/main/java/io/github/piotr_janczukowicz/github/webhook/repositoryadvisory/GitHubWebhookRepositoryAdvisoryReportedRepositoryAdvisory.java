package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A repository security advisory.
 *
 * @param author The author of the advisory.
 * @param closedAt The date and time of when the advisory was closed, in ISO 8601 format.
 * @param collaboratingTeams A list of teams that collaborate on the advisory.
 * @param collaboratingUsers A list of users that collaborate on the advisory.
 * @param createdAt The date and time of when the advisory was created, in ISO 8601 format.
 * @param credits credits
 * @param creditsDetailed credits_detailed
 * @param cveId The Common Vulnerabilities and Exposures (CVE) ID.
 * @param cvssSeverities cvss_severities
 * @param cweIds A list of only the CWE IDs.
 * @param cwes cwes
 * @param description A detailed description of what the advisory entails.
 * @param ghsaId The GitHub Security Advisory ID.
 * @param htmlUrl The URL for the advisory.
 * @param identifiers identifiers
 * @param privateFork A temporary private fork of the advisory's repository for collaborating on a fix.
 * @param publishedAt The date and time of when the advisory was published, in ISO 8601 format.
 * @param publisher The publisher of the advisory.
 * @param severity The severity of the advisory.
 * @param state The state of the advisory.
 * @param submission submission
 * @param summary A short summary of the advisory.
 * @param updatedAt The date and time of when the advisory was last updated, in ISO 8601 format.
 * @param url The API URL for the advisory.
 * @param vulnerabilities vulnerabilities
 * @param withdrawnAt The date and time of when the advisory was withdrawn, in ISO 8601 format.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-advisory-published/requestBody/properties/repository_advisory")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisory(
        @Nullable GitHubWebhookSimpleUser author,
        @Nullable Instant closedAt,
        @Nullable List<GitHubWebhookTeam> collaboratingTeams,
        @Nullable List<GitHubWebhookSimpleUser> collaboratingUsers,
        @Nullable Instant createdAt,
        @Nullable List<GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit> credits,
        @Nullable List<GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed> creditsDetailed,
        @Nullable String cveId,
        @Nullable GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities cvssSeverities,
        @Nullable List<String> cweIds,
        @Nullable List<GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe> cwes,
        @Nullable String description,
        String ghsaId,
        String htmlUrl,
        List<GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier> identifiers,
        @Nullable GitHubWebhookSimpleRepository privateFork,
        @Nullable Instant publishedAt,
        @Nullable GitHubWebhookSimpleUser publisher,
        @Nullable GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity severity,
        GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState state,
        @Nullable GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission submission,
        String summary,
        @Nullable Instant updatedAt,
        String url,
        @Nullable List<GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryVulnerability> vulnerabilities,
        @Nullable Instant withdrawnAt) {
    public GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisory {
        requireNonNull(ghsaId, "ghsaId");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(identifiers, "identifiers");
        requireNonNull(state, "state");
        requireNonNull(summary, "summary");
        requireNonNull(url, "url");
    }
}
