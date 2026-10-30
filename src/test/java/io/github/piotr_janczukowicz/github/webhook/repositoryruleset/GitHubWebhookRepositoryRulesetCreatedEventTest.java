package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryRulesetNull() {
        final GitHubWebhookRepositoryRulesetCreatedEventBuilder builder =
                GitHubWebhookRepositoryRulesetCreatedEventBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetCreatedEvent())
                        .repositoryRuleset(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryRuleset");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRepositoryRulesetCreatedEventBuilder builder =
                GitHubWebhookRepositoryRulesetCreatedEventBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
