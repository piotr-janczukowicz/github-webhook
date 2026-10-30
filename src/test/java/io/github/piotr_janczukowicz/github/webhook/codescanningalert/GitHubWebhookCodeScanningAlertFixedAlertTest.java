package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertFixedAlertTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCodeScanningAlertFixedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertFixedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlert())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCodeScanningAlertFixedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertFixedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlert())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenRuleNull() {
        final GitHubWebhookCodeScanningAlertFixedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertFixedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlert())
                        .rule(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rule");
    }

    @Test
    void constructor_shouldThrow_whenToolNull() {
        final GitHubWebhookCodeScanningAlertFixedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertFixedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlert())
                        .tool(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tool");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCodeScanningAlertFixedAlertBuilder builder =
                GitHubWebhookCodeScanningAlertFixedAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlert())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
