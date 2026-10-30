package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * A response to an exemption request by a delegated bypasser.
 *
 * @param createdAt The date and time the exemption request was created.
 * @param id The ID of the exemption response.
 * @param reviewerComment The comment the reviewer provided when responding to the exemption request.
 * @param reviewerId The ID of the user who reviewed the exemption request.
 * @param reviewerLogin The login of the user who reviewed the exemption request.
 * @param status The status of the exemption response.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/responses/items")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookExemptionResponse(
        @Nullable Instant createdAt,
        @Nullable Long id,
        @Nullable String reviewerComment,
        @Nullable Long reviewerId,
        @Nullable String reviewerLogin,
        @Nullable GitHubWebhookExemptionResponseStatus status) {}
