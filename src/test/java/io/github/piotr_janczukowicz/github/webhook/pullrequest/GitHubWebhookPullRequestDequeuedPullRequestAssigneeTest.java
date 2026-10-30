package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestDequeuedPullRequestAssigneeTest {

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestAssigneeBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestAssigneeBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestAssignee())
                        .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }
}
