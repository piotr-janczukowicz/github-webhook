package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMergeGroupChecksRequestedEventTest {

    @Test
    void constructor_shouldThrow_whenMergeGroupNull() {
        final GitHubWebhookMergeGroupChecksRequestedEventBuilder builder =
                GitHubWebhookMergeGroupChecksRequestedEventBuilder.builder(
                                MergeGroupCatalogFixtures.webhookMergeGroupChecksRequestedEvent())
                        .mergeGroup(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergeGroup");
    }
}
