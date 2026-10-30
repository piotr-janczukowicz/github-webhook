package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReferenceTest {

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReferenceBuilder builder =
                GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReferenceBuilder.builder(
                                CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryReference())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
