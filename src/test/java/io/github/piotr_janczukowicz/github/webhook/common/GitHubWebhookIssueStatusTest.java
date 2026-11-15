package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueStatusTest {

    @Test
    void constructor_shouldThrow_whenCategoryNull() {
        final GitHubWebhookIssueStatusBuilder builder = GitHubWebhookIssueStatusBuilder.builder(
                        CommonCatalogFixtures.webhookIssueStatus())
                .category(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("category");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssueStatusBuilder builder = GitHubWebhookIssueStatusBuilder.builder(
                        CommonCatalogFixtures.webhookIssueStatus())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
