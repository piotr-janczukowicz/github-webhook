package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMinimalRepositoryLicenseTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookMinimalRepositoryLicense fixture = CheckRunCatalogFixtures.webhookMinimalRepositoryLicense();

        final GitHubWebhookMinimalRepositoryLicense copy =
                GitHubWebhookMinimalRepositoryLicenseBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
