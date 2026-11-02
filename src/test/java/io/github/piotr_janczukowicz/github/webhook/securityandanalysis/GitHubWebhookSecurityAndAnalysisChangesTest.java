package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAndAnalysisChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecurityAndAnalysisChanges fixture =
                SecurityAndAnalysisCatalogFixtures.webhookSecurityAndAnalysisChanges();

        final GitHubWebhookSecurityAndAnalysisChanges copy =
                GitHubWebhookSecurityAndAnalysisChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
