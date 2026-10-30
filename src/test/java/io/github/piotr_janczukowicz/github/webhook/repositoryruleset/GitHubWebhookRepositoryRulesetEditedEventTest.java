package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetEditedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryRulesetNull() {
        final GitHubWebhookRepositoryRulesetEditedEventBuilder builder =
                GitHubWebhookRepositoryRulesetEditedEventBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedEvent())
                        .repositoryRuleset(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryRuleset");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRepositoryRulesetEditedEventBuilder builder =
                GitHubWebhookRepositoryRulesetEditedEventBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
