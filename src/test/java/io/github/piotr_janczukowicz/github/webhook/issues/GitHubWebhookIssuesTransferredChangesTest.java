package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesTransferredChangesTest {

    @Test
    void constructor_shouldThrow_whenNewIssueNull() {
        final GitHubWebhookIssuesTransferredChangesBuilder builder =
                GitHubWebhookIssuesTransferredChangesBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChanges())
                        .newIssue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("newIssue");
    }

    @Test
    void constructor_shouldThrow_whenNewRepositoryNull() {
        final GitHubWebhookIssuesTransferredChangesBuilder builder =
                GitHubWebhookIssuesTransferredChangesBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChanges())
                        .newRepository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("newRepository");
    }
}
