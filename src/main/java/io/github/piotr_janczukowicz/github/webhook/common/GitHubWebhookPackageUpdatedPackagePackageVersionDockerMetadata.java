package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The package updated package package version docker metadata payload.
 *
 * @param tags tags
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/package-published/requestBody/properties/package/properties/package_version/properties/docker_metadata/items")
public record GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadata(
        @Nullable List<String> tags) {}
