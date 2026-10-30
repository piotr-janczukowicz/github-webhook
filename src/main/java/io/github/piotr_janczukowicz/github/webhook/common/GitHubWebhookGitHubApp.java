package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
 * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
 * first class actors within GitHub.
 *
 * @param clientId client_id
 * @param createdAt created_at
 * @param description description
 * @param events The list of events for the GitHub app. Note that the {@code installation_target},
 *     {@code security_advisory}, and {@code meta} events are not included because they are global events and not
 *     specific to an installation.
 * @param externalUrl external_url
 * @param htmlUrl html_url
 * @param id Unique identifier of the GitHub app
 * @param installationsCount The number of installations associated with the GitHub app. Only returned when the
 *     integration is requesting details about itself.
 * @param name The name of the GitHub app
 * @param nodeId node_id
 * @param owner owner
 * @param permissions The set of permissions for the GitHub app
 * @param slug The slug name of the GitHub app
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-run-completed/requestBody/properties/check_run/properties/app")
public record GitHubWebhookGitHubApp(
        @Nullable String clientId,
        Instant createdAt,
        @Nullable String description,
        List<String> events,
        String externalUrl,
        String htmlUrl,
        long id,
        @Nullable Long installationsCount,
        String name,
        String nodeId,
        GitHubWebhookGitHubAppOwner owner,
        GitHubWebhookGitHubAppPermissions permissions,
        @Nullable String slug,
        Instant updatedAt) {
    public GitHubWebhookGitHubApp {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(events, "events");
        requireNonNull(externalUrl, "externalUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(owner, "owner");
        requireNonNull(permissions, "permissions");
        requireNonNull(updatedAt, "updatedAt");
    }
}
