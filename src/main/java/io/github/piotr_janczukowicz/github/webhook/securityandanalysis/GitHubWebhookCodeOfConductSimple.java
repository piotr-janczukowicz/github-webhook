package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Code of Conduct Simple
 *
 * @param htmlUrl html_url
 * @param key key
 * @param name name
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/security-and-analysis/requestBody/properties/repository/properties/code_of_conduct")
public record GitHubWebhookCodeOfConductSimple(@Nullable String htmlUrl, String key, String name, String url) {
    public GitHubWebhookCodeOfConductSimple {
        requireNonNull(key, "key");
        requireNonNull(name, "name");
        requireNonNull(url, "url");
    }
}
