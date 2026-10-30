package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimpleInstallationTest {

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSimpleInstallationBuilder builder = GitHubWebhookSimpleInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookSimpleInstallation())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
