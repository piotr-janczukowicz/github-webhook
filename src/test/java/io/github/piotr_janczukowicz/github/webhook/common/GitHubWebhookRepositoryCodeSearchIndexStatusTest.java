package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryCodeSearchIndexStatusTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryCodeSearchIndexStatus fixture =
                CommonCatalogFixtures.webhookRepositoryCodeSearchIndexStatus();

        final GitHubWebhookRepositoryCodeSearchIndexStatus copy =
                GitHubWebhookRepositoryCodeSearchIndexStatusBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
