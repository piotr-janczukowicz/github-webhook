package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryPermissions fixture = CommonCatalogFixtures.webhookRepositoryPermissions();

        final GitHubWebhookRepositoryPermissions copy =
                GitHubWebhookRepositoryPermissionsBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
