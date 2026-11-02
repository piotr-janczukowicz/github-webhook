package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity fixture =
                CommonCatalogFixtures.webhookFullRepositorySecurityAndAnalysisAdvancedSecurity();

        final GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity copy =
                GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
