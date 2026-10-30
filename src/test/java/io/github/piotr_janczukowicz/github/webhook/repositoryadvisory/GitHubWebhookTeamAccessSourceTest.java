package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookTeamAccessSourceTest {

    @ParameterizedTest
    @CsvSource({"'direct',DIRECT", "'organization',ORGANIZATION", "'enterprise',ENTERPRISE"})
    void fromWire_shouldReturnConstant_whenKnownValue(final String wire, final GitHubWebhookTeamAccessSource value) {
        final GitHubWebhookTeamAccessSource decoded = GitHubWebhookTeamAccessSource.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookTeamAccessSource decoded =
                GitHubWebhookTeamAccessSource.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookTeamAccessSource.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookTeamAccessSource.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
