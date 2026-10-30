package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The alert instance message payload.
 *
 * @param text text
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/code-scanning-alert-appeared-in-branch/requestBody/properties/alert/properties/most_recent_instance/properties/message")
public record GitHubWebhookAlertInstanceMessage(@Nullable String text) {}
