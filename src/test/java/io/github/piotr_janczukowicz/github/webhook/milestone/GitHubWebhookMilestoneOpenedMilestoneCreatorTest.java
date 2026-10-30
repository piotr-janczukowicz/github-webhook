package io.github.piotr_janczukowicz.github.webhook.milestone;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMilestoneOpenedMilestoneCreatorTest {

    @Test
    void constructor_shouldThrow_whenLoginNull() {
        final GitHubWebhookMilestoneOpenedMilestoneCreatorBuilder builder =
                GitHubWebhookMilestoneOpenedMilestoneCreatorBuilder.builder(
                                MilestoneCatalogFixtures.webhookMilestoneOpenedMilestoneCreator())
                        .login(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("login");
    }
}
