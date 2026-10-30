package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusCommitValueTreeTest {

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookStatusCommitValueTreeBuilder builder = GitHubWebhookStatusCommitValueTreeBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitValueTree())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookStatusCommitValueTreeBuilder builder = GitHubWebhookStatusCommitValueTreeBuilder.builder(
                        StatusCatalogFixtures.webhookStatusCommitValueTree())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
