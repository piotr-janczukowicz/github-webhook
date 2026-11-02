package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3Test {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3 fixture =
                CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3();

        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3 copy =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3Builder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
