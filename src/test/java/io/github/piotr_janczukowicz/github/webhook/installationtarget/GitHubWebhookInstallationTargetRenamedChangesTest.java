package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationTargetRenamedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookInstallationTargetRenamedChanges fixture =
                InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedChanges();

        final GitHubWebhookInstallationTargetRenamedChanges copy =
                GitHubWebhookInstallationTargetRenamedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
