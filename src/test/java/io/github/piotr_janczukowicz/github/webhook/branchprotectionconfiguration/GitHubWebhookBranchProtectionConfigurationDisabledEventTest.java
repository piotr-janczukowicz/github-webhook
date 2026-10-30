package io.github.piotr_janczukowicz.github.webhook.branchprotectionconfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBranchProtectionConfigurationDisabledEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookBranchProtectionConfigurationDisabledEventBuilder builder =
                GitHubWebhookBranchProtectionConfigurationDisabledEventBuilder.builder(
                                BranchProtectionConfigurationCatalogFixtures
                                        .webhookBranchProtectionConfigurationDisabledEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBranchProtectionConfigurationDisabledEventBuilder builder =
                GitHubWebhookBranchProtectionConfigurationDisabledEventBuilder.builder(
                                BranchProtectionConfigurationCatalogFixtures
                                        .webhookBranchProtectionConfigurationDisabledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
