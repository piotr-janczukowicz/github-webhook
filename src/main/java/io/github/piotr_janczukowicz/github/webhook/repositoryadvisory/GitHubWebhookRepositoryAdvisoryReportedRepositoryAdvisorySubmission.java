package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The repository advisory reported repository advisory submission payload.
 *
 * @param accepted Whether a private vulnerability report was accepted by the repository's administrators.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-advisory-published/requestBody/properties/repository_advisory/properties/submission")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySubmission(boolean accepted) {}
