package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrlTest {

    @Test
    void constructor_shouldThrow_whenIssueTitleUrlNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrl())
                        .issueTitleUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueTitleUrl");
    }
}
