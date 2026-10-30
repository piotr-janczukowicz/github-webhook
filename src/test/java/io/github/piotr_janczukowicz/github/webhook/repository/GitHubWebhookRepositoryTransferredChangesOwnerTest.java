package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryTransferredChangesOwnerTest {

    @Test
    void constructor_shouldThrow_whenFromNull() {
        final GitHubWebhookRepositoryTransferredChangesOwnerBuilder builder =
                GitHubWebhookRepositoryTransferredChangesOwnerBuilder.builder(
                                RepositoryCatalogFixtures.webhookRepositoryTransferredChangesOwner())
                        .from(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("from");
    }
}
