package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationTargetRenamedEventTest {

    @Test
    void constructor_shouldThrow_whenAccountNull() {
        final GitHubWebhookInstallationTargetRenamedEventBuilder builder =
                GitHubWebhookInstallationTargetRenamedEventBuilder.builder(
                                InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedEvent())
                        .account(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("account");
    }

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookInstallationTargetRenamedEventBuilder builder =
                GitHubWebhookInstallationTargetRenamedEventBuilder.builder(
                                InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenInstallationNull() {
        final GitHubWebhookInstallationTargetRenamedEventBuilder builder =
                GitHubWebhookInstallationTargetRenamedEventBuilder.builder(
                                InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedEvent())
                        .installation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("installation");
    }

    @Test
    void constructor_shouldThrow_whenTargetTypeNull() {
        final GitHubWebhookInstallationTargetRenamedEventBuilder builder =
                GitHubWebhookInstallationTargetRenamedEventBuilder.builder(
                                InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedEvent())
                        .targetType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetType");
    }
}
