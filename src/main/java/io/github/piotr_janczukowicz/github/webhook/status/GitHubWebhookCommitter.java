package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The committer payload.
 *
 * @param date date
 * @param email email
 * @param name name
 * @param username username
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody/properties/commit/properties/commit/properties/author")
public record GitHubWebhookCommitter(
        String date, String email, String name, @Nullable String username) {
    public GitHubWebhookCommitter {
        requireNonNull(date, "date");
        requireNonNull(email, "email");
        requireNonNull(name, "name");
    }
}
