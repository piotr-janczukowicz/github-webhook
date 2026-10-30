package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A request from a user to be exempted from a set of rules.
 *
 * @param createdAt The date and time the exemption request was created.
 * @param exemptionRequestData exemption_request_data
 * @param expiresAt The date and time the exemption request will expire.
 * @param htmlUrl The URL to view the exemption request in a browser.
 * @param id The ID of the exemption request.
 * @param metadata Metadata about the exemption request.
 * @param number The number uniquely identifying the exemption request within its repository.
 * @param repositoryId The ID of the repository the exemption request is for.
 * @param requestType The type of request.
 * @param requesterComment The comment the requester provided when creating the exemption request.
 * @param requesterId The ID of the user who requested the exemption.
 * @param requesterLogin The login of the user who requested the exemption.
 * @param resourceIdentifier The unique identifier for the request type of the exemption request. For example, a commit
 *     SHA.
 * @param responses The responses to the exemption request.
 * @param status The status of the exemption request.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookExemptionRequest(
        @Nullable Instant createdAt,
        @Nullable GitHubWebhookExemptionRequestExemptionRequestData exemptionRequestData,
        @Nullable Instant expiresAt,
        @Nullable String htmlUrl,
        @Nullable Long id,
        @Nullable GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadata metadata,
        @Nullable Long number,
        @Nullable Long repositoryId,
        @Nullable GitHubWebhookExemptionRequestRequestType requestType,
        @Nullable String requesterComment,
        @Nullable Long requesterId,
        @Nullable String requesterLogin,
        @Nullable String resourceIdentifier,
        @Nullable List<GitHubWebhookExemptionResponse> responses,
        @Nullable GitHubWebhookExemptionRequestStatus status) {}
