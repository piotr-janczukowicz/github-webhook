package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAdvisoryWithdrawnEventTest {

    @Test
    void constructor_shouldThrow_whenSecurityAdvisoryNull() {
        final GitHubWebhookSecurityAdvisoryWithdrawnEventBuilder builder =
                GitHubWebhookSecurityAdvisoryWithdrawnEventBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnEvent())
                        .securityAdvisory(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("securityAdvisory");
    }
}
