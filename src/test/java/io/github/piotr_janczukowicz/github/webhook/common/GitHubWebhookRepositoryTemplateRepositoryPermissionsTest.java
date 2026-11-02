package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryTemplateRepositoryPermissionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryTemplateRepositoryPermissions fixture =
                CommonCatalogFixtures.webhookRepositoryTemplateRepositoryPermissions();

        final GitHubWebhookRepositoryTemplateRepositoryPermissions copy =
                GitHubWebhookRepositoryTemplateRepositoryPermissionsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
