package io.github.piotr_janczukowicz.github.webhook.release;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The release edited changes payload.
 *
 * @param body body
 * @param makeLatest make_latest
 * @param name name
 * @param tagName tag_name
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/release-edited/requestBody/properties/changes")
public record GitHubWebhookReleaseEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody body,
        @Nullable GitHubWebhookReleaseEditedChangesMakeLatest makeLatest,
        @Nullable GitHubWebhookIssuesEditedChangesBody name,
        @Nullable GitHubWebhookIssuesEditedChangesBody tagName) {}
