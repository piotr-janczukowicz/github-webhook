package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesFieldAddedIssueFieldTest {

    @Test
    void constructor_shouldThrow_whenFieldTypeNull() {
        final GitHubWebhookIssuesFieldAddedIssueFieldBuilder builder =
                GitHubWebhookIssuesFieldAddedIssueFieldBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesFieldAddedIssueField())
                        .fieldType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fieldType");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssuesFieldAddedIssueFieldBuilder builder =
                GitHubWebhookIssuesFieldAddedIssueFieldBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesFieldAddedIssueField())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
