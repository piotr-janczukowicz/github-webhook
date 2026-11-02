package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdated fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesConditionsUpdated();

        final GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdated copy =
                GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
