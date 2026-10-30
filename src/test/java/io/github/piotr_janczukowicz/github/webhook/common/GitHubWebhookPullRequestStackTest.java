package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestStackTest {

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestStackBuilder builder = GitHubWebhookPullRequestStackBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestStack())
                .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }
}
