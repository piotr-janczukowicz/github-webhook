package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMaxFilePathLengthParametersTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookMaxFilePathLengthParameters fixture =
                RepositoryRulesetCatalogFixtures.webhookMaxFilePathLengthParameters();

        final GitHubWebhookMaxFilePathLengthParameters copy =
                GitHubWebhookMaxFilePathLengthParametersBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
