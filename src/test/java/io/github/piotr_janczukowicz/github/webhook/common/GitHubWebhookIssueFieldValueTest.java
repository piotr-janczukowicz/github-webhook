package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueFieldValueTest {

    @Test
    void constructor_shouldThrow_whenDataTypeNull() {
        final GitHubWebhookIssueFieldValueBuilder builder = GitHubWebhookIssueFieldValueBuilder.builder(
                        CommonCatalogFixtures.webhookIssueFieldValue())
                .dataType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("dataType");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssueFieldValueBuilder builder = GitHubWebhookIssueFieldValueBuilder.builder(
                        CommonCatalogFixtures.webhookIssueFieldValue())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
