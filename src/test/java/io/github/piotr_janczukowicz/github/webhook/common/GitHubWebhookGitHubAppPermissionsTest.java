package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookGitHubAppPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookGitHubAppPermissions fixture = CommonCatalogFixtures.webhookGitHubAppPermissions();

        final GitHubWebhookGitHubAppPermissions copy =
                GitHubWebhookGitHubAppPermissionsBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
