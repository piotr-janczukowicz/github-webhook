package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifierTest {

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifierBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifierBuilder.builder(
                                SecurityAdvisoryCatalogFixtures
                                        .webhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier())
                        .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenValueNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifierBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifierBuilder.builder(
                                SecurityAdvisoryCatalogFixtures
                                        .webhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier())
                        .value(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
