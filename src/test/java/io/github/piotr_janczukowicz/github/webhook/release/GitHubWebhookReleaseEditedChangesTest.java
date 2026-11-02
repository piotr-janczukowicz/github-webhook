package io.github.piotr_janczukowicz.github.webhook.release;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReleaseEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookReleaseEditedChanges fixture = ReleaseCatalogFixtures.webhookReleaseEditedChanges();

        final GitHubWebhookReleaseEditedChanges copy =
                GitHubWebhookReleaseEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
