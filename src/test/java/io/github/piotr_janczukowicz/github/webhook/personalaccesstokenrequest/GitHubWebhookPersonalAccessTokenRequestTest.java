package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPersonalAccessTokenRequestTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPersonalAccessTokenRequestBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookPersonalAccessTokenRequestBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequest())
                        .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenPermissionsAddedNull() {
        final GitHubWebhookPersonalAccessTokenRequestBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequest())
                        .permissionsAdded(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permissionsAdded");
    }

    @Test
    void constructor_shouldThrow_whenPermissionsResultNull() {
        final GitHubWebhookPersonalAccessTokenRequestBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequest())
                        .permissionsResult(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permissionsResult");
    }

    @Test
    void constructor_shouldThrow_whenPermissionsUpgradedNull() {
        final GitHubWebhookPersonalAccessTokenRequestBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequest())
                        .permissionsUpgraded(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permissionsUpgraded");
    }

    @Test
    void constructor_shouldThrow_whenRepositorySelectionNull() {
        final GitHubWebhookPersonalAccessTokenRequestBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequest())
                        .repositorySelection(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositorySelection");
    }

    @Test
    void constructor_shouldThrow_whenTokenNameNull() {
        final GitHubWebhookPersonalAccessTokenRequestBuilder builder =
                GitHubWebhookPersonalAccessTokenRequestBuilder.builder(
                                PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequest())
                        .tokenName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tokenName");
    }
}
