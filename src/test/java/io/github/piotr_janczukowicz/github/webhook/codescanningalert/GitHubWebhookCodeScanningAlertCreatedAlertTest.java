package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertCreatedAlertTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCodeScanningAlertCreatedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertCreatedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedAlert())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenRuleNull() {
        final GitHubWebhookCodeScanningAlertCreatedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertCreatedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedAlert())
                        .rule(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rule");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCodeScanningAlertCreatedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertCreatedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedAlert())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
