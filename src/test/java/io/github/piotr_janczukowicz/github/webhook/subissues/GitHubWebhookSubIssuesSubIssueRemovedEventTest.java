package io.github.piotr_janczukowicz.github.webhook.subissues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSubIssuesSubIssueRemovedEventTest {

    @Test
    void constructor_shouldThrow_whenParentIssueNull() {
        final GitHubWebhookSubIssuesSubIssueRemovedEventBuilder builder =
                GitHubWebhookSubIssuesSubIssueRemovedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesSubIssueRemovedEvent())
                        .parentIssue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("parentIssue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookSubIssuesSubIssueRemovedEventBuilder builder =
                GitHubWebhookSubIssuesSubIssueRemovedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesSubIssueRemovedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookSubIssuesSubIssueRemovedEventBuilder builder =
                GitHubWebhookSubIssuesSubIssueRemovedEventBuilder.builder(
                                SubIssuesCatalogFixtures.webhookSubIssuesSubIssueRemovedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
