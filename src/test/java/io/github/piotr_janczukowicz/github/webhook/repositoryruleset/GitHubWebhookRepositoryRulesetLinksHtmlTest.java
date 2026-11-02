package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRulesetLinksHtmlTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookRepositoryRulesetLinksHtml fixture =
                RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetLinksHtml();

        final GitHubWebhookRepositoryRulesetLinksHtml copy =
                GitHubWebhookRepositoryRulesetLinksHtmlBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
