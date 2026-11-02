package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeCoverageParametersTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookCodeCoverageParameters fixture =
                RepositoryRulesetCatalogFixtures.webhookCodeCoverageParameters();

        final GitHubWebhookCodeCoverageParameters copy =
                GitHubWebhookCodeCoverageParametersBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
