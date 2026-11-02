package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryTransferredChangesOwnerFromTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryTransferredChangesOwnerFrom fixture =
                RepositoryCatalogFixtures.webhookRepositoryTransferredChangesOwnerFrom();

        final GitHubWebhookRepositoryTransferredChangesOwnerFrom copy =
                GitHubWebhookRepositoryTransferredChangesOwnerFromBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
