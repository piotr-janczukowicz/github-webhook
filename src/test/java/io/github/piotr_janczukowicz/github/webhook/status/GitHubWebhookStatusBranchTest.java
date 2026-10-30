package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusBranchTest {

    @Test
    void constructor_shouldThrow_whenCommitNull() {
        final GitHubWebhookStatusBranchBuilder builder = GitHubWebhookStatusBranchBuilder.builder(
                        StatusCatalogFixtures.webhookStatusBranch())
                .commit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commit");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookStatusBranchBuilder builder = GitHubWebhookStatusBranchBuilder.builder(
                        StatusCatalogFixtures.webhookStatusBranch())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
