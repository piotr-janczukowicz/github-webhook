package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesStatusChangedChangesStateTest {

    @Test
    void constructor_shouldThrow_whenFromNull() {
        final GitHubWebhookIssuesStatusChangedChangesStateBuilder builder =
                GitHubWebhookIssuesStatusChangedChangesStateBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesStatusChangedChangesState())
                        .from(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("from");
    }
}
