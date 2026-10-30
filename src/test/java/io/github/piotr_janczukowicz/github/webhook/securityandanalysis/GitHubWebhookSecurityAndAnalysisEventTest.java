package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAndAnalysisEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookSecurityAndAnalysisEventBuilder builder =
                GitHubWebhookSecurityAndAnalysisEventBuilder.builder(
                                SecurityAndAnalysisCatalogFixtures.webhookSecurityAndAnalysisEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookSecurityAndAnalysisEventBuilder builder =
                GitHubWebhookSecurityAndAnalysisEventBuilder.builder(
                                SecurityAndAnalysisCatalogFixtures.webhookSecurityAndAnalysisEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
