package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The member edited changes permission payload.
 *
 * @param from from
 * @param to to
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/member-edited/requestBody/properties/changes/properties/permission")
public record GitHubWebhookMemberEditedChangesPermission(
        @Nullable String from, @Nullable String to) {}
