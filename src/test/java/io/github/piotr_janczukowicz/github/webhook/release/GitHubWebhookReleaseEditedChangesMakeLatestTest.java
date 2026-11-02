package io.github.piotr_janczukowicz.github.webhook.release;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReleaseEditedChangesMakeLatestTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookReleaseEditedChangesMakeLatest fixture =
                ReleaseCatalogFixtures.webhookReleaseEditedChangesMakeLatest();

        final GitHubWebhookReleaseEditedChangesMakeLatest copy =
                GitHubWebhookReleaseEditedChangesMakeLatestBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
