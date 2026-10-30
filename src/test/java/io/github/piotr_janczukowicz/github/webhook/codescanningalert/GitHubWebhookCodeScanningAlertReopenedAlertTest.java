package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertReopenedAlertTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCodeScanningAlertReopenedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedAlert())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCodeScanningAlertReopenedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedAlert())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenRuleNull() {
        final GitHubWebhookCodeScanningAlertReopenedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedAlert())
                        .rule(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rule");
    }

    @Test
    void constructor_shouldThrow_whenToolNull() {
        final GitHubWebhookCodeScanningAlertReopenedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedAlert())
                        .tool(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tool");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCodeScanningAlertReopenedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedAlert())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
