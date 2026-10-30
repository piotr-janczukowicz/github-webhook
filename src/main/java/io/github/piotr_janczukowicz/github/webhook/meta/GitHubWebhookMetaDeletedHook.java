package io.github.piotr_janczukowicz.github.webhook.meta;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;

/**
 * The deleted webhook. This will contain different keys based on the type of webhook it is: repository, organization,
 * business, app, or GitHub Marketplace.
 *
 * @param active active
 * @param config config
 * @param createdAt created_at
 * @param events events
 * @param id id
 * @param name name
 * @param type type
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/meta-deleted/requestBody/properties/hook")
public record GitHubWebhookMetaDeletedHook(
        boolean active,
        GitHubWebhookMetaDeletedHookConfig config,
        String createdAt,
        List<GitHubWebhookMetaDeletedHookEvent> events,
        long id,
        String name,
        String type,
        String updatedAt) {
    public GitHubWebhookMetaDeletedHook {
        requireNonNull(config, "config");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(events, "events");
        requireNonNull(name, "name");
        requireNonNull(type, "type");
        requireNonNull(updatedAt, "updatedAt");
    }
}
