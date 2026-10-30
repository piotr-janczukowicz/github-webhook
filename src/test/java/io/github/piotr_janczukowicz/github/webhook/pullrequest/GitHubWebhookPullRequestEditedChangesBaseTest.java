package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestEditedChangesBaseTest {

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestEditedChangesBaseBuilder builder =
                GitHubWebhookPullRequestEditedChangesBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestEditedChangesBase())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestEditedChangesBaseBuilder builder =
                GitHubWebhookPullRequestEditedChangesBaseBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestEditedChangesBase())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
