package io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentProtectionRuleRequestedEventTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDeploymentProtectionRuleRequestedEvent fixture =
                DeploymentProtectionRuleCatalogFixtures.webhookDeploymentProtectionRuleRequestedEvent();

        final GitHubWebhookDeploymentProtectionRuleRequestedEvent copy =
                GitHubWebhookDeploymentProtectionRuleRequestedEventBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
