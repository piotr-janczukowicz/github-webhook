package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookOrganizationCustomPropertyValueTypeTest {

    @ParameterizedTest
    @CsvSource({
        "'string',STRING",
        "'single_select',SINGLE_SELECT",
        "'multi_select',MULTI_SELECT",
        "'true_false',TRUE_FALSE",
        "'url',URL"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookOrganizationCustomPropertyValueType value) {
        final GitHubWebhookOrganizationCustomPropertyValueType decoded =
                GitHubWebhookOrganizationCustomPropertyValueType.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookOrganizationCustomPropertyValueType decoded =
                GitHubWebhookOrganizationCustomPropertyValueType.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookOrganizationCustomPropertyValueType.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookOrganizationCustomPropertyValueType.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
