package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPersonalAccessTokenRequestApprovedEventTest {

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestApprovedEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestApprovedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenPersonalAccessTokenRequestNull() {
        final GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestApprovedEvent())
                        .personalAccessTokenRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("personalAccessTokenRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures
                                        .webhookPersonalAccessTokenRequestApprovedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
