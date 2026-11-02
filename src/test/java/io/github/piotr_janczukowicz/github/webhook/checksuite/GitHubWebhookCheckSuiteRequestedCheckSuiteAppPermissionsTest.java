package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissions fixture =
                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuiteAppPermissions();

        final GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissions copy =
                GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissionsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
