package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerTest {

    @Test
    void constructor_shouldThrow_whenReviewerTypeNull() {
        final GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerBuilder builder =
                GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerBuilder.builder(
                                CommonCatalogFixtures
                                        .webhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewer())
                        .reviewerType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewerType");
    }
}
