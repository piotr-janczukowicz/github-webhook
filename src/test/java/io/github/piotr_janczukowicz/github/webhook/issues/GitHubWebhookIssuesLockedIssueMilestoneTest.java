package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesLockedIssueMilestoneTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesLockedIssueMilestoneBuilder builder =
                GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesLockedIssueMilestoneBuilder builder =
                GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesLockedIssueMilestoneBuilder builder =
                GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesLockedIssueMilestoneBuilder builder =
                GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookIssuesLockedIssueMilestoneBuilder builder =
                GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookIssuesLockedIssueMilestoneBuilder builder =
                GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesLockedIssueMilestoneBuilder builder =
                GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesLockedIssueMilestoneBuilder builder =
                GitHubWebhookIssuesLockedIssueMilestoneBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
