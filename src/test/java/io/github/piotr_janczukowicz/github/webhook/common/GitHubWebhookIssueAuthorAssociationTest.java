package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookIssueAuthorAssociationTest {

    @ParameterizedTest
    @CsvSource({
        "'COLLABORATOR',COLLABORATOR",
        "'CONTRIBUTOR',CONTRIBUTOR",
        "'FIRST_TIMER',FIRST_TIMER",
        "'FIRST_TIME_CONTRIBUTOR',FIRST_TIME_CONTRIBUTOR",
        "'MANNEQUIN',MANNEQUIN",
        "'MEMBER',MEMBER",
        "'NONE',NONE",
        "'OWNER',OWNER"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookIssueAuthorAssociation value) {
        final GitHubWebhookIssueAuthorAssociation decoded = GitHubWebhookIssueAuthorAssociation.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookIssueAuthorAssociation decoded =
                GitHubWebhookIssueAuthorAssociation.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookIssueAuthorAssociation.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookIssueAuthorAssociation.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
