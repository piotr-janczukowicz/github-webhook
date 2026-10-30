package io.github.piotr_janczukowicz.github.webhook.membership;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookMembershipRemovedScopeTest {

    @ParameterizedTest
    @CsvSource({"'team',TEAM", "'organization',ORGANIZATION"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookMembershipRemovedScope value) {
        final GitHubWebhookMembershipRemovedScope decoded = GitHubWebhookMembershipRemovedScope.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookMembershipRemovedScope decoded =
                GitHubWebhookMembershipRemovedScope.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookMembershipRemovedScope.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookMembershipRemovedScope.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
