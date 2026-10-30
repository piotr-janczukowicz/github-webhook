package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The status commit value verification reason. */
@CatalogSchema(
        "webhooks/status/requestBody/properties/commit/properties/commit/properties/verification/properties/reason")
public enum GitHubWebhookStatusCommitValueVerificationReason {
    EXPIRED_KEY("expired_key"),
    NOT_SIGNING_KEY("not_signing_key"),
    GPGVERIFY_ERROR("gpgverify_error"),
    GPGVERIFY_UNAVAILABLE("gpgverify_unavailable"),
    UNSIGNED("unsigned"),
    UNKNOWN_SIGNATURE_TYPE("unknown_signature_type"),
    NO_USER("no_user"),
    UNVERIFIED_EMAIL("unverified_email"),
    BAD_EMAIL("bad_email"),
    UNKNOWN_KEY("unknown_key"),
    MALFORMED_SIGNATURE("malformed_signature"),
    INVALID("invalid"),
    VALID("valid"),
    BAD_CERT("bad_cert"),
    OCSP_PENDING("ocsp_pending"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookStatusCommitValueVerificationReason> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookStatusCommitValueVerificationReason.class,
                    GitHubWebhookStatusCommitValueVerificationReason::wireValue);

    private final String wireValue;

    GitHubWebhookStatusCommitValueVerificationReason(final String wireValue) {
        this.wireValue = wireValue;
    }

    /**
     * Value GitHub sends in JSON.
     *
     * @return wire string
     */
    @JsonValue
    public String wireValue() {
        return wireValue;
    }

    /**
     * The status commit value verification reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookStatusCommitValueVerificationReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
