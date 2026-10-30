package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisoryTest {

    @Test
    void constructor_shouldThrow_whenGhsaIdNull() {
        final GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisoryBuilder builder =
                GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisoryBuilder.builder(
                                DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlertSecurityAdvisory())
                        .ghsaId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ghsaId");
    }
}
