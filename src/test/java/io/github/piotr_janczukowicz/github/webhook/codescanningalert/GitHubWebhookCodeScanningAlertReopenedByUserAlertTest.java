package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertReopenedByUserAlertTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlert())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlert())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenRuleNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlert())
                        .rule(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rule");
    }

    @Test
    void constructor_shouldThrow_whenToolNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlert())
                        .tool(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tool");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertReopenedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlert())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
