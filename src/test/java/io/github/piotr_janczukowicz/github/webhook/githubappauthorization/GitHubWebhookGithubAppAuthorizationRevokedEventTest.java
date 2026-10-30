package io.github.piotr_janczukowicz.github.webhook.githubappauthorization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookGithubAppAuthorizationRevokedEventTest {

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookGithubAppAuthorizationRevokedEventBuilder builder =
                GitHubWebhookGithubAppAuthorizationRevokedEventBuilder.builder(
                                GithubAppAuthorizationCatalogFixtures.webhookGithubAppAuthorizationRevokedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
