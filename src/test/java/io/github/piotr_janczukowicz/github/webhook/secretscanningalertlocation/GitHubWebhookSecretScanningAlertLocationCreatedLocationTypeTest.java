package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookSecretScanningAlertLocationCreatedLocationTypeTest {

    @ParameterizedTest
    @CsvSource({
        "'commit',COMMIT",
        "'wiki_commit',WIKI_COMMIT",
        "'issue_title',ISSUE_TITLE",
        "'issue_body',ISSUE_BODY",
        "'issue_comment',ISSUE_COMMENT",
        "'discussion_title',DISCUSSION_TITLE",
        "'discussion_body',DISCUSSION_BODY",
        "'discussion_comment',DISCUSSION_COMMENT",
        "'pull_request_title',PULL_REQUEST_TITLE",
        "'pull_request_body',PULL_REQUEST_BODY",
        "'pull_request_comment',PULL_REQUEST_COMMENT",
        "'pull_request_review',PULL_REQUEST_REVIEW",
        "'pull_request_review_comment',PULL_REQUEST_REVIEW_COMMENT"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookSecretScanningAlertLocationCreatedLocationType value) {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationType decoded =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationType decoded =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationType.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookSecretScanningAlertLocationCreatedLocationType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookSecretScanningAlertLocationCreatedLocationType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
