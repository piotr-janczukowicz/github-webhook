package io.github.piotr_janczukowicz.github.webhook.repository;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository transferred changes owner from payload.
 *
 * @param organization organization
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-transferred/requestBody/properties/changes/properties/owner/properties/from")
public record GitHubWebhookRepositoryTransferredChangesOwnerFrom(
        @Nullable GitHubWebhookOrganization organization,
        @Nullable GitHubWebhookUser user) {}
