package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesOpenedChangesTest {

    @Test
    void constructor_shouldThrow_whenOldRepositoryNull() {
        final GitHubWebhookIssuesOpenedChangesBuilder builder = GitHubWebhookIssuesOpenedChangesBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesOpenedChanges())
                .oldRepository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("oldRepository");
    }
}
