package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryAnonymousAccessDisabledEventTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryAnonymousAccessDisabledEvent fixture =
                RepositoryCatalogFixtures.webhookRepositoryAnonymousAccessDisabledEvent();

        final GitHubWebhookRepositoryAnonymousAccessDisabledEvent copy =
                GitHubWebhookRepositoryAnonymousAccessDisabledEventBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
