package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRenamedChangesTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookRepositoryRenamedChangesBuilder builder =
                GitHubWebhookRepositoryRenamedChangesBuilder.builder(
                                RepositoryCatalogFixtures.webhookRepositoryRenamedChanges())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
