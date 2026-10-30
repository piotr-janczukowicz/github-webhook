package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesMilestonedEventTest {

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesMilestonedEventBuilder builder = GitHubWebhookIssuesMilestonedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenMilestoneNull() {
        final GitHubWebhookIssuesMilestonedEventBuilder builder = GitHubWebhookIssuesMilestonedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedEvent())
                .milestone(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestone");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesMilestonedEventBuilder builder = GitHubWebhookIssuesMilestonedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesMilestonedEventBuilder builder = GitHubWebhookIssuesMilestonedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesMilestonedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
