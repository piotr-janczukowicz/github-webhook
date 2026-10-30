package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The changes made to the item may involve modifications in the item's fields and draft issue body. It includes altered
 * values for text, number, date, single select, and iteration fields, along with the GraphQL node ID of the changed
 * field.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(GitHubWebhookProjectsV2ItemEditedChangesFieldValue.class),
    @JsonSubTypes.Type(GitHubWebhookProjectsV2ItemEditedChangesBody.class)
})
public sealed interface GitHubWebhookProjectsV2ItemEditedChanges
        permits GitHubWebhookProjectsV2ItemEditedChangesFieldValue, GitHubWebhookProjectsV2ItemEditedChangesBody {}
