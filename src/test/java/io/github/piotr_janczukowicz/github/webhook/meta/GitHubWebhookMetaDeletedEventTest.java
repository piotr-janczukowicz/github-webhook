package io.github.piotr_janczukowicz.github.webhook.meta;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMetaDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenHookNull() {
        final GitHubWebhookMetaDeletedEventBuilder builder = GitHubWebhookMetaDeletedEventBuilder.builder(
                        MetaCatalogFixtures.webhookMetaDeletedEvent())
                .hook(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hook");
    }
}
