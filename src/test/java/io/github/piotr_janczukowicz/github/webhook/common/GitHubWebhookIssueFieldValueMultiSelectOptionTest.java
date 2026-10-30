package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueFieldValueMultiSelectOptionTest {

    @Test
    void constructor_shouldThrow_whenColorNull() {
        final GitHubWebhookIssueFieldValueMultiSelectOptionBuilder builder =
                GitHubWebhookIssueFieldValueMultiSelectOptionBuilder.builder(
                                CommonCatalogFixtures.webhookIssueFieldValueMultiSelectOption())
                        .color(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("color");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssueFieldValueMultiSelectOptionBuilder builder =
                GitHubWebhookIssueFieldValueMultiSelectOptionBuilder.builder(
                                CommonCatalogFixtures.webhookIssueFieldValueMultiSelectOption())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
