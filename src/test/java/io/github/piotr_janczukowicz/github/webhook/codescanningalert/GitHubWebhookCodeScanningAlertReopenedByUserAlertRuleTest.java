package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertReopenedByUserAlertRuleTest {

    @Test
    void constructor_shouldThrow_whenDescriptionNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserAlertRuleBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserAlertRuleBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlertRule())
                        .description(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("description");
    }

    @Test
    void constructor_shouldThrow_whenIdNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserAlertRuleBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserAlertRuleBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlertRule())
                        .id(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("id");
    }
}
