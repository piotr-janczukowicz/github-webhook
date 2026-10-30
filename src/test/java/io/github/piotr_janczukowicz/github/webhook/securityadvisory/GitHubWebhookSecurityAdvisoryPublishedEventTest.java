package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAdvisoryPublishedEventTest {

    @Test
    void constructor_shouldThrow_whenSecurityAdvisoryNull() {
        final GitHubWebhookSecurityAdvisoryPublishedEventBuilder builder =
                GitHubWebhookSecurityAdvisoryPublishedEventBuilder.builder(
                                SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryPublishedEvent())
                        .securityAdvisory(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("securityAdvisory");
    }
}
