package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The status of the issue, or {@code null} if it has none. Issue statuses are in preview and only available to accounts
 * enrolled in the preview.
 *
 * @param category A stable identifier for the category, such as {@code backlog}, {@code planned}, {@code started},
 *     {@code completed}, {@code not_planned} or {@code duplicate}. Clients should expect new keys to be added.
 * @param id The stable identifier of the planning status.
 * @param name The display name of the planning status, which may change in the future.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-dependencies-blocked-by-added/requestBody/properties/blocked_issue/properties/status")
public record GitHubWebhookIssueStatus(String category, long id, String name) {
    public GitHubWebhookIssueStatus {
        requireNonNull(category, "category");
        requireNonNull(name, "name");
    }
}
