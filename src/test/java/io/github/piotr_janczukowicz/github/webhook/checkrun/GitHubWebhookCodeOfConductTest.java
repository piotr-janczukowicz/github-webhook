package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeOfConductTest {

    @Test
    void constructor_shouldThrow_whenKeyNull() {
        final GitHubWebhookCodeOfConductBuilder builder = GitHubWebhookCodeOfConductBuilder.builder(
                        CheckRunCatalogFixtures.webhookCodeOfConduct())
                .key(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("key");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookCodeOfConductBuilder builder = GitHubWebhookCodeOfConductBuilder.builder(
                        CheckRunCatalogFixtures.webhookCodeOfConduct())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCodeOfConductBuilder builder = GitHubWebhookCodeOfConductBuilder.builder(
                        CheckRunCatalogFixtures.webhookCodeOfConduct())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
