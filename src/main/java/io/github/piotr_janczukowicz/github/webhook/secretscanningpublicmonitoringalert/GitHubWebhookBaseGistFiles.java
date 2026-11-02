package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The base gist files payload.
 *
 * @param encoding The encoding used for {@code content}. Currently, {@code "utf-8"} and {@code "base64"} are supported.
 * @param filename filename
 * @param language language
 * @param rawUrl raw_url
 * @param size size
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert/properties/gist/properties/files/additionalProperties")
@Flavors({GitHubWebhookFlavor.GHEC})
public record GitHubWebhookBaseGistFiles(
        @Nullable String encoding,
        @Nullable String filename,
        @Nullable String language,
        @Nullable String rawUrl,
        @Nullable Long size,
        @Nullable String type) {}
