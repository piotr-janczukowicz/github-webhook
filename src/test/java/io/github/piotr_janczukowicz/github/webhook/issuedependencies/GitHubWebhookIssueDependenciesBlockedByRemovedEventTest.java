package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueDependenciesBlockedByRemovedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookIssueDependenciesBlockedByRemovedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockedByRemovedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockedByRemovedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueDependenciesBlockedByRemovedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockedByRemovedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockedByRemovedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueDependenciesBlockedByRemovedEventBuilder builder =
                GitHubWebhookIssueDependenciesBlockedByRemovedEventBuilder.builder(
                                IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockedByRemovedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
