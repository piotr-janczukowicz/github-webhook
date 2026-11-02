package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryEditedChanges fixture = RepositoryCatalogFixtures.webhookRepositoryEditedChanges();

        final GitHubWebhookRepositoryEditedChanges copy =
                GitHubWebhookRepositoryEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
