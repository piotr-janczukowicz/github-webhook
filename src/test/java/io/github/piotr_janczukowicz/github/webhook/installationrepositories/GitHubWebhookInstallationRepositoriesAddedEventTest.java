package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationRepositoriesAddedEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookInstallationRepositoriesAddedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesAddedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesAddedEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesAddedNull() {
        final GitHubWebhookInstallationRepositoriesAddedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesAddedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesAddedEvent())
                        .repositoriesAdded(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesAdded");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesRemovedNull() {
        final GitHubWebhookInstallationRepositoriesAddedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesAddedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesAddedEvent())
                        .repositoriesRemoved(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesRemoved");
    }

    @Test
    void constructor_shouldThrow_whenRepositorySelectionNull() {
        final GitHubWebhookInstallationRepositoriesAddedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesAddedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesAddedEvent())
                        .repositorySelection(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositorySelection");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookInstallationRepositoriesAddedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesAddedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesAddedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
