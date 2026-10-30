package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionCategoryChangedChangesTest {

    @Test
    void constructor_shouldThrow_whenCategoryNull() {
        final GitHubWebhookDiscussionCategoryChangedChangesBuilder builder =
                GitHubWebhookDiscussionCategoryChangedChangesBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionCategoryChangedChanges())
                        .category(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("category");
    }
}
