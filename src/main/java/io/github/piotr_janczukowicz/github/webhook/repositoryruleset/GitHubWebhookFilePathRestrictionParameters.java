package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;

/**
 * The file path restriction parameters payload.
 *
 * @param restrictedFilePaths The file paths that are restricted from being pushed to the commit graph.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/21/properties/parameters")
public record GitHubWebhookFilePathRestrictionParameters(List<String> restrictedFilePaths) {
    public GitHubWebhookFilePathRestrictionParameters {
        requireNonNull(restrictedFilePaths, "restrictedFilePaths");
    }
}
