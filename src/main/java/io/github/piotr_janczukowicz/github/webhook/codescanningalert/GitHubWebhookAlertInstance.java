package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The alert instance payload.
 *
 * @param analysisKey Identifies the configuration under which the analysis was executed. For example, in GitHub Actions
 *     this includes the workflow filename and job name.
 * @param category Identifies the configuration under which the analysis was executed.
 * @param classifications classifications
 * @param commitSha commit_sha
 * @param environment Identifies the variable values associated with the environment in which the analysis that
 *     generated this alert instance was performed, such as the language that was analyzed.
 * @param location location
 * @param message message
 * @param ref The full Git reference, formatted as {@code refs/heads/<branch name>}.
 * @param state State of a code scanning alert.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/code-scanning-alert-appeared-in-branch/requestBody/properties/alert/properties/most_recent_instance")
public record GitHubWebhookAlertInstance(
        String analysisKey,
        @Nullable String category,
        @Nullable List<String> classifications,
        @Nullable String commitSha,
        String environment,
        @Nullable GitHubWebhookAlertInstanceLocation location,
        @Nullable GitHubWebhookAlertInstanceMessage message,
        String ref,
        GitHubWebhookAlertInstanceState state) {
    public GitHubWebhookAlertInstance {
        requireNonNull(analysisKey, "analysisKey");
        requireNonNull(environment, "environment");
        requireNonNull(ref, "ref");
        requireNonNull(state, "state");
    }
}
