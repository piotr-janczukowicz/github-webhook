package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestAssigneeTest {

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookSimplePullRequestAssigneeBuilder builder =
                GitHubWebhookSimplePullRequestAssigneeBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestAssignee())
                        .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }
}
