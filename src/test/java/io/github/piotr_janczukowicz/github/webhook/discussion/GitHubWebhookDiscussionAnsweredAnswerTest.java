package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionAnsweredAnswerTest {

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookDiscussionAnsweredAnswerBuilder builder =
                GitHubWebhookDiscussionAnsweredAnswerBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionAnsweredAnswer())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookDiscussionAnsweredAnswerBuilder builder =
                GitHubWebhookDiscussionAnsweredAnswerBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionAnsweredAnswer())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDiscussionAnsweredAnswerBuilder builder =
                GitHubWebhookDiscussionAnsweredAnswerBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionAnsweredAnswer())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDiscussionAnsweredAnswerBuilder builder =
                GitHubWebhookDiscussionAnsweredAnswerBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionAnsweredAnswer())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDiscussionAnsweredAnswerBuilder builder =
                GitHubWebhookDiscussionAnsweredAnswerBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionAnsweredAnswer())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookDiscussionAnsweredAnswerBuilder builder =
                GitHubWebhookDiscussionAnsweredAnswerBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionAnsweredAnswer())
                        .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDiscussionAnsweredAnswerBuilder builder =
                GitHubWebhookDiscussionAnsweredAnswerBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionAnsweredAnswer())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
