package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusCommitValueTest {

    @Test
    void constructor_shouldThrow_whenAuthorNull() {
        final GitHubWebhookStatusCommitValueBuilder builder = GitHubWebhookStatusCommitValueBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitValue())
                .author(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("author");
    }

    @Test
    void constructor_shouldThrow_whenCommitterNull() {
        final GitHubWebhookStatusCommitValueBuilder builder = GitHubWebhookStatusCommitValueBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitValue())
                .committer(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("committer");
    }

    @Test
    void constructor_shouldThrow_whenMessageNull() {
        final GitHubWebhookStatusCommitValueBuilder builder = GitHubWebhookStatusCommitValueBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitValue())
                .message(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("message");
    }

    @Test
    void constructor_shouldThrow_whenTreeNull() {
        final GitHubWebhookStatusCommitValueBuilder builder = GitHubWebhookStatusCommitValueBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitValue())
                .tree(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tree");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookStatusCommitValueBuilder builder = GitHubWebhookStatusCommitValueBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitValue())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVerificationNull() {
        final GitHubWebhookStatusCommitValueBuilder builder = GitHubWebhookStatusCommitValueBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitValue())
                .verification(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("verification");
    }
}
