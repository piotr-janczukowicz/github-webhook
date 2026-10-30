package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeScanningToolTest {

    @Test
    void constructor_shouldThrow_whenAlertsThresholdNull() {
        final GitHubWebhookCodeScanningToolBuilder builder = GitHubWebhookCodeScanningToolBuilder.builder(
                        RepositoryRulesetCatalogFixtures.webhookCodeScanningTool())
                .alertsThreshold(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alertsThreshold");
    }

    @Test
    void constructor_shouldThrow_whenSecurityAlertsThresholdNull() {
        final GitHubWebhookCodeScanningToolBuilder builder = GitHubWebhookCodeScanningToolBuilder.builder(
                        RepositoryRulesetCatalogFixtures.webhookCodeScanningTool())
                .securityAlertsThreshold(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("securityAlertsThreshold");
    }

    @Test
    void constructor_shouldThrow_whenToolNull() {
        final GitHubWebhookCodeScanningToolBuilder builder = GitHubWebhookCodeScanningToolBuilder.builder(
                        RepositoryRulesetCatalogFixtures.webhookCodeScanningTool())
                .tool(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tool");
    }
}
