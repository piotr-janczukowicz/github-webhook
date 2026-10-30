package io.github.piotr_janczukowicz.github.webhook.ping;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The ping event payload.
 *
 * @param hook The webhook that is being pinged
 * @param hookId The ID of the webhook that triggered the ping.
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 * @param zen Random string of GitHub zen.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/ping/requestBody")
public record GitHubWebhookPingEvent(
        @Nullable GitHubWebhookPingHook hook,
        @Nullable Long hookId,
        @Nullable GitHubWebhookOrganizationSimple organization,
        @Nullable GitHubWebhookForkRepository repository,
        @Nullable GitHubWebhookSimpleUser sender,
        @Nullable String zen)
        implements GitHubWebhookEvent {}
