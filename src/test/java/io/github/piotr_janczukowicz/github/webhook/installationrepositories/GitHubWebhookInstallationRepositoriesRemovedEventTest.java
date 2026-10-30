package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationRepositoriesRemovedEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookInstallationRepositoriesRemovedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesRemovedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesRemovedEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesAddedNull() {
        final GitHubWebhookInstallationRepositoriesRemovedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesRemovedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesRemovedEvent())
                        .repositoriesAdded(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesAdded");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesRemovedNull() {
        final GitHubWebhookInstallationRepositoriesRemovedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesRemovedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesRemovedEvent())
                        .repositoriesRemoved(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesRemoved");
    }

    @Test
    void constructor_shouldThrow_whenRepositorySelectionNull() {
        final GitHubWebhookInstallationRepositoriesRemovedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesRemovedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesRemovedEvent())
                        .repositorySelection(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositorySelection");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookInstallationRepositoriesRemovedEventBuilder builder =
                GitHubWebhookInstallationRepositoriesRemovedEventBuilder.builder(
                                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesRemovedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
