package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The installation repositories added repositories removed payload.
 *
 * @param fullName full_name
 * @param id Unique identifier of the repository
 * @param name The name of the repository.
 * @param nodeId node_id
 * @param privateValue Whether the repository is private or public.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/installation-repositories-added/requestBody/properties/repositories_removed/items")
public record GitHubWebhookInstallationRepositoriesAddedRepositoriesRemoved(
        @Nullable String fullName,
        @Nullable Long id,
        @Nullable String name,
        @Nullable String nodeId,
        @Nullable @JsonProperty("private") Boolean privateValue) {}
