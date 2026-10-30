package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionTest {

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionBuilder builder =
                GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetPropertyTargetingDefinition())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPropertyValuesNull() {
        final GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionBuilder builder =
                GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetPropertyTargetingDefinition())
                        .propertyValues(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("propertyValues");
    }
}
