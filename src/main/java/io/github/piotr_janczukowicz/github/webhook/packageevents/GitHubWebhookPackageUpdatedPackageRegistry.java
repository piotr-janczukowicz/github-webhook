package io.github.piotr_janczukowicz.github.webhook.packageevents;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The package updated package registry payload.
 *
 * @param aboutUrl about_url
 * @param name name
 * @param type type
 * @param url url
 * @param vendor vendor
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/package-published/requestBody/properties/package/properties/registry")
public record GitHubWebhookPackageUpdatedPackageRegistry(
        String aboutUrl, String name, String type, String url, String vendor) {
    public GitHubWebhookPackageUpdatedPackageRegistry {
        requireNonNull(aboutUrl, "aboutUrl");
        requireNonNull(name, "name");
        requireNonNull(type, "type");
        requireNonNull(url, "url");
        requireNonNull(vendor, "vendor");
    }
}
