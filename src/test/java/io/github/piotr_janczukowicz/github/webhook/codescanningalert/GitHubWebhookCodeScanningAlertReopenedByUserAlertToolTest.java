package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertReopenedByUserAlertToolTest {

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserAlertToolBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserAlertToolBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlertTool())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
