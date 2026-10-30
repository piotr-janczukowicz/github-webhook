package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The repository edited changes topics payload.
 *
 * @param from from
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-edited/requestBody/properties/changes/properties/topics")
public record GitHubWebhookRepositoryEditedChangesTopics(
        @Nullable List<String> from) {}
