package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusCheckConfigurationTest {

    @Test
    void constructor_shouldThrow_whenContextNull() {
        final GitHubWebhookStatusCheckConfigurationBuilder builder =
                GitHubWebhookStatusCheckConfigurationBuilder.builder(
                                RepositoryRulesetCatalogFixtures.webhookStatusCheckConfiguration())
                        .context(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("context");
    }
}
