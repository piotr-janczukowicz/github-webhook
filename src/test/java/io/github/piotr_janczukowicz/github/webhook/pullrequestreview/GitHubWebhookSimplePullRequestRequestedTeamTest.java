package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestRequestedTeamTest {

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookSimplePullRequestRequestedTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedTeamBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestRequestedTeam())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
