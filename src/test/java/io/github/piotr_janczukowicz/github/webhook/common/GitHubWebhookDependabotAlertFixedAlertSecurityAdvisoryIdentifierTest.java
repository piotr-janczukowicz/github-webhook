package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierTest {

    @Test
    void constructor_shouldThrow_whenTypeNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierBuilder.builder(
                                CommonCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier())
                        .type(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void constructor_shouldThrow_whenValueNull() {
        final GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierBuilder builder =
                GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierBuilder.builder(
                                CommonCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier())
                        .value(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
