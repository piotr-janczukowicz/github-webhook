package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookAppPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookAppPermissions fixture = CommonCatalogFixtures.webhookAppPermissions();

        final GitHubWebhookAppPermissions copy =
                GitHubWebhookAppPermissionsBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
