package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookFullRepositorySecurityAndAnalysisTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookFullRepositorySecurityAndAnalysis fixture =
                CommonCatalogFixtures.webhookFullRepositorySecurityAndAnalysis();

        final GitHubWebhookFullRepositorySecurityAndAnalysis copy =
                GitHubWebhookFullRepositorySecurityAndAnalysisBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
