package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPersonalAccessTokenRequestDeniedEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestDeniedEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestDeniedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenPersonalAccessTokenRequestNull() {
        final GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestDeniedEvent())
                        .personalAccessTokenRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("personalAccessTokenRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestDeniedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
