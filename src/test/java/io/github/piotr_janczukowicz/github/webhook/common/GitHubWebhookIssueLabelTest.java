package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueLabelTest {

    @Test
    void ofText_shouldSetOnlyTheName() {
        final GitHubWebhookIssueLabel value = GitHubWebhookIssueLabel.ofText("text");

        assertThat(value)
                .isEqualTo(GitHubWebhookIssueLabelBuilder.builder().name("text").build());
    }

    @Test
    void ofText_shouldThrowNullPointerException_whenTextNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookIssueLabel.ofText(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("text");
    }
}
