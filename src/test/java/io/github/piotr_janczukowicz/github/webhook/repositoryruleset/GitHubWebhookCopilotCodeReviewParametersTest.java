package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCopilotCodeReviewParametersTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookCopilotCodeReviewParameters fixture =
                RepositoryRulesetCatalogFixtures.webhookCopilotCodeReviewParameters();

        final GitHubWebhookCopilotCodeReviewParameters copy =
                GitHubWebhookCopilotCodeReviewParametersBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
