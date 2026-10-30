package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;

/**
 * The file extension restriction parameters payload.
 *
 * @param restrictedFileExtensions The file extensions that are restricted from being pushed to the commit graph.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/23/properties/parameters")
public record GitHubWebhookFileExtensionRestrictionParameters(List<String> restrictedFileExtensions) {
    public GitHubWebhookFileExtensionRestrictionParameters {
        requireNonNull(restrictedFileExtensions, "restrictedFileExtensions");
    }
}
