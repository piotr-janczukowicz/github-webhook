package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckSuiteRerequestedCheckSuiteAppTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteAppBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteAppBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuiteApp())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteAppBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteAppBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuiteApp())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookCheckSuiteRerequestedCheckSuiteAppBuilder builder =
                GitHubWebhookCheckSuiteRerequestedCheckSuiteAppBuilder.builder(
                                CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuiteApp())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
