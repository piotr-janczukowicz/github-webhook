package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChanges fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesConditionsUpdatedChanges();

        final GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChanges copy =
                GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
