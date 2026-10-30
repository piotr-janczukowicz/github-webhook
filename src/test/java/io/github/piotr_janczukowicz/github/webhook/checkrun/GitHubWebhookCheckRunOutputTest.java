package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunOutputTest {

    @Test
    void constructor_shouldThrow_whenAnnotationsUrlNull() {
        final GitHubWebhookCheckRunOutputBuilder builder = GitHubWebhookCheckRunOutputBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRunOutput())
                .annotationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("annotationsUrl");
    }
}
