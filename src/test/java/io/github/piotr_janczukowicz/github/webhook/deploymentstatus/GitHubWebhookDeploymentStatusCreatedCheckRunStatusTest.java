package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookDeploymentStatusCreatedCheckRunStatusTest {

    @ParameterizedTest
    @CsvSource({
        "'queued',QUEUED",
        "'in_progress',IN_PROGRESS",
        "'completed',COMPLETED",
        "'waiting',WAITING",
        "'pending',PENDING"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookDeploymentStatusCreatedCheckRunStatus value) {
        final GitHubWebhookDeploymentStatusCreatedCheckRunStatus decoded =
                GitHubWebhookDeploymentStatusCreatedCheckRunStatus.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookDeploymentStatusCreatedCheckRunStatus decoded =
                GitHubWebhookDeploymentStatusCreatedCheckRunStatus.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookDeploymentStatusCreatedCheckRunStatus.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookDeploymentStatusCreatedCheckRunStatus.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
