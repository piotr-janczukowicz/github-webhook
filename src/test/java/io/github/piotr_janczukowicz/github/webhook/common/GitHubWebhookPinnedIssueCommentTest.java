package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPinnedIssueCommentTest {

    @Test
    void constructor_shouldThrow_whenPinnedAtNull() {
        final GitHubWebhookPinnedIssueCommentBuilder builder = GitHubWebhookPinnedIssueCommentBuilder.builder(
                        CommonCatalogFixtures.webhookPinnedIssueComment())
                .pinnedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pinnedAt");
    }
}
