package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * New requested permissions, categorized by type of permission.
 *
 * @param organization organization
 * @param other other
 * @param repository repository
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/personal-access-token-request-approved/requestBody/properties/personal_access_token_request/properties/permissions_added")
public record GitHubWebhookPersonalAccessTokenRequestPermissionsAdded(
        @Nullable Map<String, String> organization,
        @Nullable Map<String, String> other,
        @Nullable Map<String, String> repository) {}
