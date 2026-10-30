package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * Metaproperties for Git author/committer information.
 *
 * @param date date
 * @param email email
 * @param name The git author's name.
 * @param username username
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-suite-completed/requestBody/properties/check_suite/properties/head_commit/properties/author")
public record GitHubWebhookCommitter(
        @Nullable Instant date,
        @Nullable String email,
        String name,
        @Nullable String username) {
    public GitHubWebhookCommitter {
        requireNonNull(name, "name");
    }
}
