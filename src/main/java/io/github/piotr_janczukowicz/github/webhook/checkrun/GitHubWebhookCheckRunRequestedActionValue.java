package io.github.piotr_janczukowicz.github.webhook.checkrun;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The action requested by the user.
 *
 * @param identifier The integrator reference of the action requested by the user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-run-requested-action/requestBody/properties/requested_action")
public record GitHubWebhookCheckRunRequestedActionValue(
        @Nullable String identifier) {}
