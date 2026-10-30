package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditTypeTest {

    @ParameterizedTest
    @CsvSource({
        "'analyst',ANALYST",
        "'finder',FINDER",
        "'reporter',REPORTER",
        "'coordinator',COORDINATOR",
        "'remediation_developer',REMEDIATION_DEVELOPER",
        "'remediation_reviewer',REMEDIATION_REVIEWER",
        "'remediation_verifier',REMEDIATION_VERIFIER",
        "'tool',TOOL",
        "'sponsor',SPONSOR",
        "'other',OTHER"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType value) {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType decoded =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType decoded =
                GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(
                () -> GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
