package io.github.piotr_janczukowicz.github.webhook.pagebuild;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPageBuildEventTest {

    @Test
    void constructor_shouldThrow_whenBuildValueNull() {
        final GitHubWebhookPageBuildEventBuilder builder = GitHubWebhookPageBuildEventBuilder.builder(
                        PageBuildCatalogFixtures.webhookPageBuildEvent())
                .buildValue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("buildValue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPageBuildEventBuilder builder = GitHubWebhookPageBuildEventBuilder.builder(
                        PageBuildCatalogFixtures.webhookPageBuildEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPageBuildEventBuilder builder = GitHubWebhookPageBuildEventBuilder.builder(
                        PageBuildCatalogFixtures.webhookPageBuildEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
