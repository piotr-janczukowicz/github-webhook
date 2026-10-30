package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Represents a 'commit' secret scanning location type. This location type shows that a secret was detected inside a
 * commit to a repository.
 *
 * @param blobSha SHA-1 hash ID of the associated blob
 * @param blobUrl The API URL to get the associated blob resource
 * @param commitSha SHA-1 hash ID of the associated commit
 * @param commitUrl The API URL to get the associated commit resource
 * @param endColumn The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII
 * @param endLine Line number at which the secret ends in the file
 * @param htmlUrl The GitHub URL to get the associated commit resource.
 * @param path The file path in the repository
 * @param startColumn The column at which the secret starts within the start line when the file is interpreted as 8BIT
 *     ASCII
 * @param startLine Line number at which the secret starts in the file
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/0")
public record GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl(
        String blobSha,
        String blobUrl,
        String commitSha,
        String commitUrl,
        double endColumn,
        double endLine,
        @Nullable String htmlUrl,
        String path,
        double startColumn,
        double startLine)
        implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl {
        requireNonNull(blobSha, "blobSha");
        requireNonNull(blobUrl, "blobUrl");
        requireNonNull(commitSha, "commitSha");
        requireNonNull(commitUrl, "commitUrl");
        requireNonNull(path, "path");
    }
}
