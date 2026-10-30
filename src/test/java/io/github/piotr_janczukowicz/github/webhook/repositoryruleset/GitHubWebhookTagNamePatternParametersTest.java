package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookTagNamePatternParametersTest {

    @Test
    void constructor_shouldThrow_whenOperatorNull() {
        final GitHubWebhookTagNamePatternParametersBuilder builder =
                GitHubWebhookTagNamePatternParametersBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookTagNamePatternParameters())
                        .operator(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("operator");
    }

    @Test
    void constructor_shouldThrow_whenPatternNull() {
        final GitHubWebhookTagNamePatternParametersBuilder builder =
                GitHubWebhookTagNamePatternParametersBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookTagNamePatternParameters())
                        .pattern(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pattern");
    }
}
