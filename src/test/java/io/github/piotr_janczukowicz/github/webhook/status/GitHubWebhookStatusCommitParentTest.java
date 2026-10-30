package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusCommitParentTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookStatusCommitParentBuilder builder = GitHubWebhookStatusCommitParentBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitParent())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookStatusCommitParentBuilder builder = GitHubWebhookStatusCommitParentBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitParent())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookStatusCommitParentBuilder builder = GitHubWebhookStatusCommitParentBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitParent())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
