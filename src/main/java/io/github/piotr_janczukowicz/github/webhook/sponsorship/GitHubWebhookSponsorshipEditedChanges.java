package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The sponsorship edited changes payload.
 *
 * @param privacyLevel privacy_level
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/sponsorship-edited/requestBody/properties/changes")
public record GitHubWebhookSponsorshipEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody privacyLevel) {}
