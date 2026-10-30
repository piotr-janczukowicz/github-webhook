package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemEditedChangesBodyTest {

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookProjectsV2ItemEditedChangesBodyBuilder builder =
                GitHubWebhookProjectsV2ItemEditedChangesBodyBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemEditedChangesBody())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }
}
