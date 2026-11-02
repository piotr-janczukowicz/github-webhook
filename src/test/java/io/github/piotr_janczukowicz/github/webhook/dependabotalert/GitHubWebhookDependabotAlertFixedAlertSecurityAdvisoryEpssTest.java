package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpssTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpss fixture =
                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisoryEpss();

        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpss copy =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpssBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
