package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrlTest {

    @Test
    void constructor_shouldThrow_whenPullRequestBodyUrlNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsPullRequestBodyUrl())
                        .pullRequestBodyUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequestBodyUrl");
    }
}
