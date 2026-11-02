package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryAnonymousAccessEnabledEventTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryAnonymousAccessEnabledEvent fixture =
                RepositoryCatalogFixtures.webhookRepositoryAnonymousAccessEnabledEvent();

        final GitHubWebhookRepositoryAnonymousAccessEnabledEvent copy =
                GitHubWebhookRepositoryAnonymousAccessEnabledEventBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
