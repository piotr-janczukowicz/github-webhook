package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuePullRequestTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuePullRequest fixture = CommonCatalogFixtures.webhookIssuePullRequest();

        final GitHubWebhookIssuePullRequest copy =
                GitHubWebhookIssuePullRequestBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
