package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChanges fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesRulesUpdatedChanges();

        final GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChanges copy =
                GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
