package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryRulesetNull() {
        final GitHubWebhookRepositoryRulesetDeletedEventBuilder builder =
                GitHubWebhookRepositoryRulesetDeletedEventBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetDeletedEvent())
                        .repositoryRuleset(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryRuleset");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRepositoryRulesetDeletedEventBuilder builder =
                GitHubWebhookRepositoryRulesetDeletedEventBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetDeletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
