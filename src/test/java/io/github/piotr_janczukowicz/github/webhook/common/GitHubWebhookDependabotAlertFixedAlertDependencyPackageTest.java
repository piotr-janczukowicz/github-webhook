package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertDependencyPackageTest {

    @Test
    void constructor_shouldThrow_whenEcosystemNull() {
        final GitHubWebhookDependabotAlertFixedAlertDependencyPackageBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertDependencyPackageBuilder.builder(
                                CommonCatalogFixtures.webhookDependabotAlertFixedAlertDependencyPackage())
                        .ecosystem(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ecosystem");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookDependabotAlertFixedAlertDependencyPackageBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertDependencyPackageBuilder.builder(
                                CommonCatalogFixtures.webhookDependabotAlertFixedAlertDependencyPackage())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }
}
