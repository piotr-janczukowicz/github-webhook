package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCommitterTest {

    @Test
    void constructor_shouldThrow_whenDateNull() {
        final GitHubWebhookCommitterBuilder builder = GitHubWebhookCommitterBuilder.builder(
                        StatusCatalogFixtures.webhookCommitter())
                .date(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("date");
    }

    @Test
    void constructor_shouldThrow_whenEmailNull() {
        final GitHubWebhookCommitterBuilder builder = GitHubWebhookCommitterBuilder.builder(
                        StatusCatalogFixtures.webhookCommitter())
                .email(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("email");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookCommitterBuilder builder = GitHubWebhookCommitterBuilder.builder(
                        StatusCatalogFixtures.webhookCommitter())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
