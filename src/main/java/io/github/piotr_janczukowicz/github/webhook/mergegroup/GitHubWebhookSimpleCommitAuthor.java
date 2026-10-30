package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Information about the Git author
 *
 * @param email Git email address of the commit's author
 * @param name Name of the commit's author
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/merge-group-checks-requested/requestBody/properties/merge_group/properties/head_commit/properties/author")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookSimpleCommitAuthor(String email, String name) {
    public GitHubWebhookSimpleCommitAuthor {
        requireNonNull(email, "email");
        requireNonNull(name, "name");
    }
}
