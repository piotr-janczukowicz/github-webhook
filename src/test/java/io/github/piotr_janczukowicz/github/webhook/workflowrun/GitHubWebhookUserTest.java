package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookUserTest {

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookUserBuilder builder = GitHubWebhookUserBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookUser())
                .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }
}
