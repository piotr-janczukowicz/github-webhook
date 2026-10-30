package io.github.piotr_janczukowicz.github.webhook.meta;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMetaDeletedHookConfigTest {

    @Test
    void constructor_shouldThrow_whenContentTypeNull() {
        final GitHubWebhookMetaDeletedHookConfigBuilder builder = GitHubWebhookMetaDeletedHookConfigBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHookConfig())
                .contentType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentType");
    }

    @Test
    void constructor_shouldThrow_whenInsecureSslNull() {
        final GitHubWebhookMetaDeletedHookConfigBuilder builder = GitHubWebhookMetaDeletedHookConfigBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHookConfig())
                .insecureSsl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("insecureSsl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookMetaDeletedHookConfigBuilder builder = GitHubWebhookMetaDeletedHookConfigBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedHookConfig())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
