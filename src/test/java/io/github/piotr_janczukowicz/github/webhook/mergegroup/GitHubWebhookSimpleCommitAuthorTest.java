package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimpleCommitAuthorTest {

    @Test
    void constructor_shouldThrow_whenEmailNull() {
        final GitHubWebhookSimpleCommitAuthorBuilder builder = GitHubWebhookSimpleCommitAuthorBuilder.builder(
                        MergeGroupCatalogFixtures.webhookSimpleCommitAuthor())
                .email(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("email");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookSimpleCommitAuthorBuilder builder = GitHubWebhookSimpleCommitAuthorBuilder.builder(
                        MergeGroupCatalogFixtures.webhookSimpleCommitAuthor())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
