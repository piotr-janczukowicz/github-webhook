package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The check run output payload.
 *
 * @param annotationsCount annotations_count
 * @param annotationsUrl annotations_url
 * @param summary summary
 * @param text text
 * @param title title
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-run-completed/requestBody/properties/check_run/properties/output")
public record GitHubWebhookCheckRunOutput(
        long annotationsCount,
        String annotationsUrl,
        @Nullable String summary,
        @Nullable String text,
        @Nullable String title) {
    public GitHubWebhookCheckRunOutput {
        requireNonNull(annotationsUrl, "annotationsUrl");
    }
}
