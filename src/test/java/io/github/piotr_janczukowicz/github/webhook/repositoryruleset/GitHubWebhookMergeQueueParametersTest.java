package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMergeQueueParametersTest {

    @Test
    void constructor_shouldThrow_whenGroupingStrategyNull() {
        final GitHubWebhookMergeQueueParametersBuilder builder = GitHubWebhookMergeQueueParametersBuilder.builder(
                        RepositoryRulesetCatalogFixtures.webhookMergeQueueParameters())
                .groupingStrategy(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("groupingStrategy");
    }

    @Test
    void constructor_shouldThrow_whenMergeMethodNull() {
        final GitHubWebhookMergeQueueParametersBuilder builder = GitHubWebhookMergeQueueParametersBuilder.builder(
                        RepositoryRulesetCatalogFixtures.webhookMergeQueueParameters())
                .mergeMethod(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergeMethod");
    }
}
