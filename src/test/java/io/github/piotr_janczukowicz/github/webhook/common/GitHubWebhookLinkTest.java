package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookLinkTest {

    @Test
    void constructor_shouldThrow_whenHrefNull() {
        final GitHubWebhookLinkBuilder builder = GitHubWebhookLinkBuilder.builder(CommonCatalogFixtures.webhookLink())
                .href(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("href");
    }
}
