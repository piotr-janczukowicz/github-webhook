package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueDependenciesBlockingAddedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookIssueDependenciesBlockingAddedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockingAddedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockingAddedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueDependenciesBlockingAddedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockingAddedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockingAddedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueDependenciesBlockingAddedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockingAddedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockingAddedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
