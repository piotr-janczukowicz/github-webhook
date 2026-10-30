package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Code Of Conduct
 *
 * @param body body
 * @param htmlUrl html_url
 * @param key key
 * @param name name
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/repository/properties/code_of_conduct")
public record GitHubWebhookCodeOfConduct(
        @Nullable String body, @Nullable String htmlUrl, String key, String name, String url) {
    public GitHubWebhookCodeOfConduct {
        requireNonNull(key, "key");
        requireNonNull(name, "name");
        requireNonNull(url, "url");
    }
}
