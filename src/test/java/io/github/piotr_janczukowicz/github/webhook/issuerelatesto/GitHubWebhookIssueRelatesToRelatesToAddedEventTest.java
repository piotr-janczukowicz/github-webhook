package io.github.piotr_janczukowicz.github.webhook.issuerelatesto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueRelatesToRelatesToAddedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookIssueRelatesToRelatesToAddedEventBuilder builder =
                GitHubWebhookIssueRelatesToRelatesToAddedEventBuilder.builder(
                                IssueRelatesToCatalogFixtures.webhookIssueRelatesToRelatesToAddedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueRelatesToRelatesToAddedEventBuilder builder =
                GitHubWebhookIssueRelatesToRelatesToAddedEventBuilder.builder(
                                IssueRelatesToCatalogFixtures.webhookIssueRelatesToRelatesToAddedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueRelatesToRelatesToAddedEventBuilder builder =
                GitHubWebhookIssueRelatesToRelatesToAddedEventBuilder.builder(
                                IssueRelatesToCatalogFixtures.webhookIssueRelatesToRelatesToAddedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
