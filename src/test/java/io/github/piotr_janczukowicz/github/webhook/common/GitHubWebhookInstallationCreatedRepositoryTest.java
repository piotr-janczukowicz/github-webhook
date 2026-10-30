package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationCreatedRepositoryTest {

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookInstallationCreatedRepositoryBuilder builder =
                GitHubWebhookInstallationCreatedRepositoryBuilder.builder(
                                CommonCatalogFixtures.webhookInstallationCreatedRepository())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookInstallationCreatedRepositoryBuilder builder =
                GitHubWebhookInstallationCreatedRepositoryBuilder.builder(
                                CommonCatalogFixtures.webhookInstallationCreatedRepository())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookInstallationCreatedRepositoryBuilder builder =
                GitHubWebhookInstallationCreatedRepositoryBuilder.builder(
                                CommonCatalogFixtures.webhookInstallationCreatedRepository())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
