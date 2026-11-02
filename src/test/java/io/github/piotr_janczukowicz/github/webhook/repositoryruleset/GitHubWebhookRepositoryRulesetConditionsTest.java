package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetConditionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetConditions fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditions();

        final GitHubWebhookRepositoryRulesetConditions copy =
                GitHubWebhookRepositoryRulesetConditionsBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
