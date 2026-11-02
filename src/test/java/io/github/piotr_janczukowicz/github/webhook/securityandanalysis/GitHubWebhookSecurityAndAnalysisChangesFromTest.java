package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAndAnalysisChangesFromTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecurityAndAnalysisChangesFrom fixture =
                SecurityAndAnalysisCatalogFixtures.webhookSecurityAndAnalysisChangesFrom();

        final GitHubWebhookSecurityAndAnalysisChangesFrom copy =
                GitHubWebhookSecurityAndAnalysisChangesFromBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
