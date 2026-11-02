package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetConditionsRepositoryPropertyTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetConditionsRepositoryProperty fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditionsRepositoryProperty();

        final GitHubWebhookRepositoryRulesetConditionsRepositoryProperty copy =
                GitHubWebhookRepositoryRulesetConditionsRepositoryPropertyBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
