package io.github.piotr_janczukowicz.github.webhook.membership;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookMembershipAddedScopeTest {

    @ParameterizedTest
    @CsvSource({"'team',TEAM"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookMembershipAddedScope value) {
        final GitHubWebhookMembershipAddedScope decoded = GitHubWebhookMembershipAddedScope.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookMembershipAddedScope decoded =
                GitHubWebhookMembershipAddedScope.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookMembershipAddedScope.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookMembershipAddedScope.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
