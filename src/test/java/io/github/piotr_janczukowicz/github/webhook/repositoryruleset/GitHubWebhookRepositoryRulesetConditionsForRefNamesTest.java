package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetConditionsForRefNamesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetConditionsForRefNames fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditionsForRefNames();

        final GitHubWebhookRepositoryRulesetConditionsForRefNames copy =
                GitHubWebhookRepositoryRulesetConditionsForRefNamesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
