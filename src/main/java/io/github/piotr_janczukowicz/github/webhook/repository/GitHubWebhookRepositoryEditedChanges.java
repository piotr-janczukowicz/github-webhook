package io.github.piotr_janczukowicz.github.webhook.repository;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectCardEditedChangesNote;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryEditedChangesTopics;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository edited changes payload.
 *
 * @param defaultBranch default_branch
 * @param description description
 * @param homepage homepage
 * @param topics topics
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-edited/requestBody/properties/changes")
public record GitHubWebhookRepositoryEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody defaultBranch,
        @Nullable GitHubWebhookProjectCardEditedChangesNote description,
        @Nullable GitHubWebhookProjectCardEditedChangesNote homepage,
        @Nullable GitHubWebhookRepositoryEditedChangesTopics topics) {}
