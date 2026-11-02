package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertDependencyTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDependabotAlertFixedAlertDependency fixture =
                DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertDependency();

        final GitHubWebhookDependabotAlertFixedAlertDependency copy =
                GitHubWebhookDependabotAlertFixedAlertDependencyBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
