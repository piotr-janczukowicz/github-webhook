package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;

/**
 * Represents a 'wiki_commit' secret scanning location type. This location type shows that a secret was detected inside
 * a commit to a repository wiki.
 *
 * @param blobSha SHA-1 hash ID of the associated blob
 * @param commitSha SHA-1 hash ID of the associated commit
 * @param commitUrl The GitHub URL to get the associated wiki commit
 * @param endColumn The column at which the secret ends within the end line when the file is interpreted as 8-bit ASCII.
 * @param endLine Line number at which the secret ends in the file
 * @param pageUrl The GitHub URL to get the associated wiki page
 * @param path The file path of the wiki page
 * @param startColumn The column at which the secret starts within the start line when the file is interpreted as 8-bit
 *     ASCII.
 * @param startLine Line number at which the secret starts in the file
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/1")
public record GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl(
        String blobSha,
        String commitSha,
        String commitUrl,

        @SuppressSchemaTypeMismatch("type rule: int (end_column)")
        int endColumn,

        @SuppressSchemaTypeMismatch("type rule: int (end_line)")
        int endLine,

        String pageUrl,
        String path,

        @SuppressSchemaTypeMismatch("type rule: int (start_column)")
        int startColumn,

        @SuppressSchemaTypeMismatch("type rule: int (start_line)")
        int startLine)
        implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl {
        requireNonNull(blobSha, "blobSha");
        requireNonNull(commitSha, "commitSha");
        requireNonNull(commitUrl, "commitUrl");
        requireNonNull(pageUrl, "pageUrl");
        requireNonNull(path, "path");
    }
}
