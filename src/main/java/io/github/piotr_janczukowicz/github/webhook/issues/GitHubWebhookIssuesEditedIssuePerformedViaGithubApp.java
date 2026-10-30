package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissions;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
 * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
 * first class actors within GitHub.
 *
 * @param createdAt created_at
 * @param description description
 * @param events The list of events for the GitHub app
 * @param externalUrl external_url
 * @param htmlUrl html_url
 * @param id Unique identifier of the GitHub app
 * @param name The name of the GitHub app
 * @param nodeId node_id
 * @param owner owner
 * @param permissions The set of permissions for the GitHub app
 * @param slug The slug name of the GitHub app
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-edited/requestBody/properties/issue/properties/performed_via_github_app")
public record GitHubWebhookIssuesEditedIssuePerformedViaGithubApp(
        @Nullable Instant createdAt,
        @Nullable String description,
        @Nullable List<GitHubWebhookIssuesEditedIssuePerformedViaGithubAppEvent> events,
        @Nullable String externalUrl,
        String htmlUrl,
        @Nullable Long id,
        String name,
        String nodeId,
        @Nullable GitHubWebhookUser owner,
        @Nullable GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissions permissions,
        @Nullable String slug,
        @Nullable Instant updatedAt) {
    public GitHubWebhookIssuesEditedIssuePerformedViaGithubApp {
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
    }
}
