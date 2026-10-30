package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrlTest {

    @Test
    void constructor_shouldThrow_whenDiscussionTitleUrlNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl())
                        .discussionTitleUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussionTitleUrl");
    }
}
