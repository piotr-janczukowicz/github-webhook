package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestStackBaseTest {

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestStackBaseBuilder builder = GitHubWebhookPullRequestStackBaseBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestStackBase())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestStackBaseBuilder builder = GitHubWebhookPullRequestStackBaseBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestStackBase())
                .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
