package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertFixedAlertToolTest {

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookCodeScanningAlertFixedAlertToolBuilder builder =
                GitHubWebhookCodeScanningAlertFixedAlertToolBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlertTool())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
