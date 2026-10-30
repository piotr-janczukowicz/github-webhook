package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertClosedByUserAlertTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserAlert())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDismissedAtNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserAlert())
                        .dismissedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("dismissedAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserAlert())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenRuleNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserAlert())
                        .rule(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rule");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserAlert())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenToolNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserAlert())
                        .tool(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tool");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder builder =
                GitHubWebhookCodeScanningAlertClosedByUserAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserAlert())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
