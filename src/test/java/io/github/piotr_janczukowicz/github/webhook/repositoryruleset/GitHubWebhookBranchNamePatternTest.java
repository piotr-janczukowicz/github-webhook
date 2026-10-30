package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBranchNamePatternTest {

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookBranchNamePatternBuilder builder = GitHubWebhookBranchNamePatternBuilder.builder(
                        RepositoryRulesetCatalogFixtures.webhookBranchNamePattern())
                .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }
}
