package io.github.piotr_janczukowicz.github.webhook.deploykey;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeployKeyCreatedKeyTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDeployKeyCreatedKeyBuilder builder = GitHubWebhookDeployKeyCreatedKeyBuilder.builder(
                        DeployKeyCatalogFixtures.webhookDeployKeyCreatedKey())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenKeyNull() {
        final GitHubWebhookDeployKeyCreatedKeyBuilder builder = GitHubWebhookDeployKeyCreatedKeyBuilder.builder(
                        DeployKeyCatalogFixtures.webhookDeployKeyCreatedKey())
                .key(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("key");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookDeployKeyCreatedKeyBuilder builder = GitHubWebhookDeployKeyCreatedKeyBuilder.builder(
                        DeployKeyCatalogFixtures.webhookDeployKeyCreatedKey())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookDeployKeyCreatedKeyBuilder builder = GitHubWebhookDeployKeyCreatedKeyBuilder.builder(
                        DeployKeyCatalogFixtures.webhookDeployKeyCreatedKey())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
