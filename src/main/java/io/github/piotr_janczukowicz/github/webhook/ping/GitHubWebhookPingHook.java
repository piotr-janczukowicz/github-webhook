package io.github.piotr_janczukowicz.github.webhook.ping;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The webhook that is being pinged
 *
 * @param active Determines whether the hook is actually triggered for the events it subscribes to.
 * @param appId Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the
 *     webhook URL you specified during registration. The GitHub App ID sent in this field is required for
 *     authenticating an app.
 * @param config config
 * @param createdAt created_at
 * @param deliveriesUrl deliveries_url
 * @param events Determines what events the hook is triggered for. Default: ['push'].
 * @param id Unique identifier of the webhook.
 * @param lastResponse last_response
 * @param name The type of webhook. The only valid value is 'web'.
 * @param pingUrl ping_url
 * @param testUrl test_url
 * @param type type
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/ping/requestBody/properties/hook")
public record GitHubWebhookPingHook(
        boolean active,
        @Nullable Long appId,
        GitHubWebhookPingHookConfig config,
        Instant createdAt,
        @Nullable String deliveriesUrl,
        List<String> events,
        long id,
        @Nullable GitHubWebhookHookResponse lastResponse,
        GitHubWebhookPingHookName name,
        @Nullable String pingUrl,
        @Nullable String testUrl,
        String type,
        Instant updatedAt,
        @Nullable String url) {
    public GitHubWebhookPingHook {
        requireNonNull(config, "config");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(events, "events");
        requireNonNull(name, "name");
        requireNonNull(type, "type");
        requireNonNull(updatedAt, "updatedAt");
    }
}
