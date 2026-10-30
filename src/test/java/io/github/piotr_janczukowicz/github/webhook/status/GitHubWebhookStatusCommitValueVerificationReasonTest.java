package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookStatusCommitValueVerificationReasonTest {

    @ParameterizedTest
    @CsvSource({
        "'expired_key',EXPIRED_KEY",
        "'not_signing_key',NOT_SIGNING_KEY",
        "'gpgverify_error',GPGVERIFY_ERROR",
        "'gpgverify_unavailable',GPGVERIFY_UNAVAILABLE",
        "'unsigned',UNSIGNED",
        "'unknown_signature_type',UNKNOWN_SIGNATURE_TYPE",
        "'no_user',NO_USER",
        "'unverified_email',UNVERIFIED_EMAIL",
        "'bad_email',BAD_EMAIL",
        "'unknown_key',UNKNOWN_KEY",
        "'malformed_signature',MALFORMED_SIGNATURE",
        "'invalid',INVALID",
        "'valid',VALID",
        "'bad_cert',BAD_CERT",
        "'ocsp_pending',OCSP_PENDING"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookStatusCommitValueVerificationReason value) {
        final GitHubWebhookStatusCommitValueVerificationReason decoded =
                GitHubWebhookStatusCommitValueVerificationReason.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookStatusCommitValueVerificationReason decoded =
                GitHubWebhookStatusCommitValueVerificationReason.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookStatusCommitValueVerificationReason.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookStatusCommitValueVerificationReason.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
