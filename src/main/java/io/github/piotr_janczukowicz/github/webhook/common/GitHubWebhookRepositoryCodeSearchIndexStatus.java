package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The status of the code search index for this repository
 *
 * @param lexicalCommitSha lexical_commit_sha
 * @param lexicalSearchOk lexical_search_ok
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/base/properties/repo/properties/code_search_index_status")
public record GitHubWebhookRepositoryCodeSearchIndexStatus(
        @Nullable String lexicalCommitSha, @Nullable Boolean lexicalSearchOk) {}
