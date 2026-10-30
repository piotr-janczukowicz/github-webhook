package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookCustomPropertyForOrganizationValuesEditableByTest {

    @ParameterizedTest
    @CsvSource({"'enterprise_actors',ENTERPRISE_ACTORS", "'enterprise_and_org_actors',ENTERPRISE_AND_ORG_ACTORS"})
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookCustomPropertyForOrganizationValuesEditableBy value) {
        final GitHubWebhookCustomPropertyForOrganizationValuesEditableBy decoded =
                GitHubWebhookCustomPropertyForOrganizationValuesEditableBy.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookCustomPropertyForOrganizationValuesEditableBy decoded =
                GitHubWebhookCustomPropertyForOrganizationValuesEditableBy.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookCustomPropertyForOrganizationValuesEditableBy.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookCustomPropertyForOrganizationValuesEditableBy.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
