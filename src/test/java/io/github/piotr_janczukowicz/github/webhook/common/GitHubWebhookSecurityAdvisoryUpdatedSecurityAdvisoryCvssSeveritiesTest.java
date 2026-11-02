package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities fixture =
                CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities();

        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities copy =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
