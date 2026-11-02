package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetConditionsRefNameTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetConditionsRefName fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditionsRefName();

        final GitHubWebhookRepositoryRulesetConditionsRefName copy =
                GitHubWebhookRepositoryRulesetConditionsRefNameBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
