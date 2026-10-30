package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteRequestedCheckSuiteAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteAppBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteAppBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuiteApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteAppBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteAppBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuiteApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookCheckSuiteRequestedCheckSuiteAppBuilder builder =
                GitHubWebhookCheckSuiteRequestedCheckSuiteAppBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuiteApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
