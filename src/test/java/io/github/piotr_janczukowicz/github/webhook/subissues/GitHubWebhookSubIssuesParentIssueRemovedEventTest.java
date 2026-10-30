package io.github.piotr_janczukowicz.github.webhook.subissues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSubIssuesParentIssueRemovedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookSubIssuesParentIssueRemovedEventBuilder builder =
                GitHubWebhookSubIssuesParentIssueRemovedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesParentIssueRemovedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookSubIssuesParentIssueRemovedEventBuilder builder =
                GitHubWebhookSubIssuesParentIssueRemovedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesParentIssueRemovedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSubIssueNull() {
        final GitHubWebhookSubIssuesParentIssueRemovedEventBuilder builder =
                GitHubWebhookSubIssuesParentIssueRemovedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesParentIssueRemovedEvent())
                        .subIssue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subIssue");
    }
}
