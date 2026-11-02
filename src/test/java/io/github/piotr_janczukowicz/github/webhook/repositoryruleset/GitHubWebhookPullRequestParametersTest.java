package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestParametersTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPullRequestParameters fixture =
                RepositoryRulesetCatalogFixtures.webhookPullRequestParameters();

        final GitHubWebhookPullRequestParameters copy =
                GitHubWebhookPullRequestParametersBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
