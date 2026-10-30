package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * A group of pull requests that the merge queue has grouped together to be merged.
 *
 * @param baseRef The full ref of the branch the merge group will be merged into.
 * @param baseSha The SHA of the merge group's parent commit.
 * @param headCommit A commit.
 * @param headRef The full ref of the merge group.
 * @param headSha The SHA of the merge group.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/merge-group-checks-requested/requestBody/properties/merge_group")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookMergeGroup(
        String baseRef, String baseSha, GitHubWebhookSimpleCommit headCommit, String headRef, String headSha) {
    public GitHubWebhookMergeGroup {
        requireNonNull(baseRef, "baseRef");
        requireNonNull(baseSha, "baseSha");
        requireNonNull(headCommit, "headCommit");
        requireNonNull(headRef, "headRef");
        requireNonNull(headSha, "headSha");
    }
}
