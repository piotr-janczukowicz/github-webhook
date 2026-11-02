package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRestrictionTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDismissalRestriction fixture =
                RepositoryRulesetCatalogFixtures.webhookDismissalRestriction();

        final GitHubWebhookDismissalRestriction copy =
                GitHubWebhookDismissalRestrictionBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
