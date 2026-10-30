package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueDependenciesBlockedByAddedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookIssueDependenciesBlockedByAddedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockedByAddedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockedByAddedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueDependenciesBlockedByAddedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockedByAddedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockedByAddedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueDependenciesBlockedByAddedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockedByAddedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockedByAddedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
