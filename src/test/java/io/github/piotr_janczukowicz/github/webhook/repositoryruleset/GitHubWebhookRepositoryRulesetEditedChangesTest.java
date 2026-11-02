package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetEditedChanges fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChanges();

        final GitHubWebhookRepositoryRulesetEditedChanges copy =
                GitHubWebhookRepositoryRulesetEditedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
