package io.github.piotr_janczukowicz.github.webhook.pagebuild;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The [List GitHub Pages builds](https://docs.github.com/rest/pages/pages#list-github-pages-builds) itself.
 *
 * @param commit commit
 * @param createdAt created_at
 * @param duration duration
 * @param error error
 * @param pusher pusher
 * @param status status
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/page-build/requestBody/properties/build")
public record GitHubWebhookPageBuildValue(
        @Nullable String commit,
        String createdAt,
        long duration,
        GitHubWebhookPageBuildValueError error,
        @Nullable GitHubWebhookUser pusher,
        String status,
        String updatedAt,
        String url) {
    public GitHubWebhookPageBuildValue {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(error, "error");
        requireNonNull(status, "status");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
