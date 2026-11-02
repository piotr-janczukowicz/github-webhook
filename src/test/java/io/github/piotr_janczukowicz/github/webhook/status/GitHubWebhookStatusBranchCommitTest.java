package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusBranchCommitTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookStatusBranchCommit fixture = StatusCatalogFixtures.webhookStatusBranchCommit();

        final GitHubWebhookStatusBranchCommit copy =
                GitHubWebhookStatusBranchCommitBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
