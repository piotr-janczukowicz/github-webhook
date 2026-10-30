package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueDependenciesBlockingRemovedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookIssueDependenciesBlockingRemovedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockingRemovedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockingRemovedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueDependenciesBlockingRemovedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockingRemovedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockingRemovedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueDependenciesBlockingRemovedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockingRemovedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockingRemovedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
