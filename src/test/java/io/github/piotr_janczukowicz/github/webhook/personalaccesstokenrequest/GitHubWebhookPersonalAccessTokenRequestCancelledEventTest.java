package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPersonalAccessTokenRequestCancelledEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestCancelledEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestCancelledEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenPersonalAccessTokenRequestNull() {
        final GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestCancelledEvent())
                        .personalAccessTokenRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("personalAccessTokenRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestCancelledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
