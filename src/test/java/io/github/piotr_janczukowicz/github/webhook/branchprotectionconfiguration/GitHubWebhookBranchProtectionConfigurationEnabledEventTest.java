package io.github.piotr_janczukowicz.github.webhook.branchprotectionconfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBranchProtectionConfigurationEnabledEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookBranchProtectionConfigurationEnabledEventBuilder builder =
                GitHubWebhookBranchProtectionConfigurationEnabledEventBuilder.builder(
                                BranchProtectionConfigurationCatalogFixtures
                                        .webhookBranchProtectionConfigurationEnabledEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBranchProtectionConfigurationEnabledEventBuilder builder =
                GitHubWebhookBranchProtectionConfigurationEnabledEventBuilder.builder(
                                BranchProtectionConfigurationCatalogFixtures
                                        .webhookBranchProtectionConfigurationEnabledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
