package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCreatedLocationDetailsDiscussionCommentUrlTest {

    @Test
    void constructor_shouldThrow_whenDiscussionCommentUrlNull() {
        final GitHubWebhookCreatedLocationDetailsDiscussionCommentUrlBuilder builder =
                GitHubWebhookCreatedLocationDetailsDiscussionCommentUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookCreatedLocationDetailsDiscussionCommentUrl())
                        .discussionCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussionCommentUrl");
    }
}
