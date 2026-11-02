package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookUpdateParametersTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookUpdateParameters fixture = RepositoryRulesetCatalogFixtures.webhookUpdateParameters();

        final GitHubWebhookUpdateParameters copy =
                GitHubWebhookUpdateParametersBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
