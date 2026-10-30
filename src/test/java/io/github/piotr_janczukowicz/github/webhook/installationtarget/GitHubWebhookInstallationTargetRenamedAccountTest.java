package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationTargetRenamedAccountTest {

    @Test
    void constructor_shouldThrow_whenAvatarUrlNull() {
        final GitHubWebhookInstallationTargetRenamedAccountBuilder builder =
                GitHubWebhookInstallationTargetRenamedAccountBuilder.builder(
                                InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedAccount())
                        .avatarUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("avatarUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookInstallationTargetRenamedAccountBuilder builder =
                GitHubWebhookInstallationTargetRenamedAccountBuilder.builder(
                                InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedAccount())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookInstallationTargetRenamedAccountBuilder builder =
                GitHubWebhookInstallationTargetRenamedAccountBuilder.builder(
                                InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedAccount())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
