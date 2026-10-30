package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesFieldAddedChangesIssueFieldValueTest {

    @Test
    void constructor_shouldThrow_whenFromNull() {
        final GitHubWebhookIssuesFieldAddedChangesIssueFieldValueBuilder builder =
                GitHubWebhookIssuesFieldAddedChangesIssueFieldValueBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesFieldAddedChangesIssueFieldValue())
                        .from(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("from");
    }
}
