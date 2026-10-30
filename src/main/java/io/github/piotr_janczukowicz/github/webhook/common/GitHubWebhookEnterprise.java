package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook is configured on
 * an enterprise account or an organization that's part of an enterprise account. For more information, see "[About
 * enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 *
 * @param avatarUrl avatar_url
 * @param createdAt created_at
 * @param description A short description of the enterprise.
 * @param htmlUrl html_url
 * @param id Unique identifier of the enterprise
 * @param name The name of the enterprise.
 * @param nodeId node_id
 * @param slug The slug url identifier for the enterprise.
 * @param updatedAt updated_at
 * @param websiteUrl The enterprise's website URL.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/branch-protection-configuration-disabled/requestBody/properties/enterprise")
public record GitHubWebhookEnterprise(
        String avatarUrl,
        @Nullable Instant createdAt,
        @Nullable String description,
        String htmlUrl,
        long id,
        String name,
        String nodeId,
        String slug,
        @Nullable Instant updatedAt,
        @Nullable String websiteUrl)
        implements GitHubWebhookGitHubAppOwner {
    public GitHubWebhookEnterprise {
        requireNonNull(avatarUrl, "avatarUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(slug, "slug");
    }
}
