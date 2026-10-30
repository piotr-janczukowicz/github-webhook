package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningAlertAppearedInBranchAlertTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchAlert())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchAlert())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenRuleNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchAlert())
                        .rule(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rule");
    }

    @Test
    void constructor_shouldThrow_whenToolNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchAlert())
                        .tool(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tool");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder builder =
                GitHubWebhookCodeScanningAlertAppearedInBranchAlertBuilder.builder(
                                CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchAlert())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
