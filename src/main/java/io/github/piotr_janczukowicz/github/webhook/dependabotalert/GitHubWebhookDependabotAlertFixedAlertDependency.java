package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDependabotAlertFixedAlertDependencyPackage;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Details for the vulnerable dependency.
 *
 * @param manifestPath The full path to the dependency manifest file, relative to the root of the repository.
 * @param packageValue Details for the vulnerable package.
 * @param relationship The vulnerable dependency's relationship to your project. &gt; [!NOTE] &gt; We are rolling out
 *     support for dependency relationship across ecosystems. This value will be "unknown" for all dependencies in
 *     unsupported ecosystems.
 * @param scope The execution scope of the vulnerable dependency.
 * @param versionRequirement The dependency version or version constraint last recorded for the dependency associated
 *     with this alert. For dependencies detected from a lockfile, this can be the resolved version. For manifest-only
 *     dependencies, it can be the declared version constraint. Returns {@code null} when unavailable. An empty string
 *     can indicate an unconstrained dependency. The stored value is limited to 64 bytes; longer requirements may have
 *     been truncated and may no longer form a complete, valid version constraint. When multiple vulnerable versions of
 *     a dependency correspond to the same alert, this field contains one recorded version or constraint and may not
 *     represent all vulnerable versions.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/dependency")
public record GitHubWebhookDependabotAlertFixedAlertDependency(
        @Nullable String manifestPath,
        @Nullable @JsonProperty("package") GitHubWebhookDependabotAlertFixedAlertDependencyPackage packageValue,
        @Nullable GitHubWebhookDependabotAlertFixedAlertDependencyRelationship relationship,
        @Nullable GitHubWebhookDependabotAlertFixedAlertDependencyScope scope,
        @Nullable String versionRequirement) {}
