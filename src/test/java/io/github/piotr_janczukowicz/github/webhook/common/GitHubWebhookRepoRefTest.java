package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepoRefTest {

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRepoRefBuilder builder = GitHubWebhookRepoRefBuilder.builder(
                        CommonCatalogFixtures.webhookRepoRef())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookRepoRefBuilder builder = GitHubWebhookRepoRefBuilder.builder(
                        CommonCatalogFixtures.webhookRepoRef())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
