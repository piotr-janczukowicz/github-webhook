package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemEditedChangesFieldValueTest {

    @Test
    void constructor_shouldThrow_whenFieldValueNull() {
        final GitHubWebhookProjectsV2ItemEditedChangesFieldValueBuilder builder =
                GitHubWebhookProjectsV2ItemEditedChangesFieldValueBuilder.builder(
                                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemEditedChangesFieldValue())
                        .fieldValue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fieldValue");
    }
}
