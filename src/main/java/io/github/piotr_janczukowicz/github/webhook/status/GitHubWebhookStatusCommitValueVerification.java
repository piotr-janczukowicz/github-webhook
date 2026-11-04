package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The status commit value verification payload.
 *
 * @param payload payload
 * @param reason reason
 * @param signature signature
 * @param verified verified
 * @param verifiedAt verified_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody/properties/commit/properties/commit/properties/verification")
public record GitHubWebhookStatusCommitValueVerification(
        @Nullable String payload,
        GitHubWebhookStatusCommitValueVerificationReason reason,
        @Nullable String signature,
        boolean verified,

        @Nullable @SuppressSchemaTypeMismatch("type rule: date-time (verified_at)")
        Instant verifiedAt) {
    public GitHubWebhookStatusCommitValueVerification {
        requireNonNull(reason, "reason");
    }
}
