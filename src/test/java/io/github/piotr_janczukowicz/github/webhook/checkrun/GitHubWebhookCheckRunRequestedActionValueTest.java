package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunRequestedActionValueTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookCheckRunRequestedActionValue fixture =
                CheckRunCatalogFixtures.webhookCheckRunRequestedActionValue();

        final GitHubWebhookCheckRunRequestedActionValue copy = GitHubWebhookCheckRunRequestedActionValueBuilder.builder(
                        fixture)
                .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
