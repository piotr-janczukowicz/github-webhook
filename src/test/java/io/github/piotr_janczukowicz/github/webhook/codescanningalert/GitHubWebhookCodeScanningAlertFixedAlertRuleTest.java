package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertFixedAlertRuleTest {

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookCodeScanningAlertFixedAlertRuleBuilder builder =
                GitHubWebhookCodeScanningAlertFixedAlertRuleBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlertRule())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenIdNull() {
        final GitHubWebhookCodeScanningAlertFixedAlertRuleBuilder builder =
                GitHubWebhookCodeScanningAlertFixedAlertRuleBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlertRule())
                        .id(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("id");
    }
}
