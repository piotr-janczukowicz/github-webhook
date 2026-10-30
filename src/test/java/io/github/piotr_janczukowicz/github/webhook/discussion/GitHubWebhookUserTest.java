package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookUserTest {

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookUserBuilder builder = GitHubWebhookUserBuilder.builder(
                        DiscussionCatalogFixtures.webhookUser())
                .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }
}
