package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The max file size parameters payload.
 *
 * @param ignoredFilePaths Files matching these patterns may exceed the maximum size.
 * @param maxFileSize The maximum file size allowed in megabytes. This limit does not apply to Git Large File Storage
 *     (Git LFS).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/24/properties/parameters")
public record GitHubWebhookMaxFileSizeParameters(@Nullable List<String> ignoredFilePaths, long maxFileSize) {}
