package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMaxFileSizeParametersTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookMaxFileSizeParameters fixture =
                RepositoryRulesetCatalogFixtures.webhookMaxFileSizeParameters();

        final GitHubWebhookMaxFileSizeParameters copy =
                GitHubWebhookMaxFileSizeParametersBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
