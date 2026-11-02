package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetEditedChangesRulesUpdated fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesRulesUpdated();

        final GitHubWebhookRepositoryRulesetEditedChangesRulesUpdated copy =
                GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
