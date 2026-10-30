package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The stack information associated with a pull request.
 *
 * @param base base
 * @param id The ID of the stack that this pull request belongs to.
 * @param number The number of the stack that this pull request belongs to.
 * @param position The one-based position of this pull request within the stack, where 1 is the bottom of the stack.
 * @param size The total number of pull requests in the stack.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/stack")
public record GitHubWebhookPullRequestStack(
        GitHubWebhookPullRequestStackBase base,
        @Nullable Long id,
        @Nullable Long number,
        @Nullable Long position,
        @Nullable Long size) {
    public GitHubWebhookPullRequestStack {
        requireNonNull(base, "base");
    }
}
