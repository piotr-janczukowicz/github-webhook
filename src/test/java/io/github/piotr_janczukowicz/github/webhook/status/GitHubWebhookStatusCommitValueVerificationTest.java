package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookStatusCommitValueVerificationTest {

    @Test
    void constructor_shouldThrow_whenReasonNull() {
        final GitHubWebhookStatusCommitValueVerificationBuilder builder =
                GitHubWebhookStatusCommitValueVerificationBuilder.builder(
                                StatusCatalogFixtures.webhookStatusCommitValueVerification())
                        .reason(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reason");
    }
}
