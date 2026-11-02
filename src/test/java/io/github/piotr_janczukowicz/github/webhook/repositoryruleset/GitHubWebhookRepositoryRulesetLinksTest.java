package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetLinksTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetLinks fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetLinks();

        final GitHubWebhookRepositoryRulesetLinks copy =
                GitHubWebhookRepositoryRulesetLinksBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
