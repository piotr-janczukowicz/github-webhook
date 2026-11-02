package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetEditedChangesConditionsTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetEditedChangesConditions fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesConditions();

        final GitHubWebhookRepositoryRulesetEditedChangesConditions copy =
                GitHubWebhookRepositoryRulesetEditedChangesConditionsBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
