package io.github.piotr_janczukowicz.github.webhook.gollum;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The gollum page payload.
 *
 * @param action The action that was performed on the page. Can be {@code created} or {@code edited}.
 * @param htmlUrl Points to the HTML wiki page.
 * @param pageName The name of the page.
 * @param sha The latest commit SHA of the page.
 * @param summary summary
 * @param title The current page title.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/gollum/requestBody/properties/pages/items")
public record GitHubWebhookGollumPage(
        GitHubWebhookGollumPageAction action,
        String htmlUrl,
        String pageName,
        String sha,
        @Nullable String summary,
        String title) {
    public GitHubWebhookGollumPage {
        requireNonNull(action, "action");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(pageName, "pageName");
        requireNonNull(sha, "sha");
        requireNonNull(title, "title");
    }
}
