package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertReachabilityTest {

    @Test
    void constructor_shouldThrow_whenVerdictNull() {
        final GitHubWebhookDependabotAlertFixedAlertReachabilityBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertReachabilityBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertReachability())
                        .verdict(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("verdict");
    }
}
