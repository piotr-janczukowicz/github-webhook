package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationRepositoriesAddedRepositoriesRemovedTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookInstallationRepositoriesAddedRepositoriesRemoved fixture =
                InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesAddedRepositoriesRemoved();

        final GitHubWebhookInstallationRepositoriesAddedRepositoriesRemoved copy =
                GitHubWebhookInstallationRepositoriesAddedRepositoriesRemovedBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
