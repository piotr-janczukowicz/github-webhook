package io.github.piotr_janczukowicz.github.webhook.subissues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSubIssuesParentIssueAddedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookSubIssuesParentIssueAddedEventBuilder builder =
                GitHubWebhookSubIssuesParentIssueAddedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesParentIssueAddedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookSubIssuesParentIssueAddedEventBuilder builder =
                GitHubWebhookSubIssuesParentIssueAddedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesParentIssueAddedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSubIssueNull() {
        final GitHubWebhookSubIssuesParentIssueAddedEventBuilder builder =
                GitHubWebhookSubIssuesParentIssueAddedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesParentIssueAddedEvent())
                        .subIssue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subIssue");
    }
}
