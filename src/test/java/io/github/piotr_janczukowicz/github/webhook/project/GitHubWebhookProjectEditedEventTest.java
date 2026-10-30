package io.github.piotr_janczukowicz.github.webhook.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectEditedEventTest {

    @Test
    void constructor_shouldThrow_whenProjectNull() {
        final GitHubWebhookProjectEditedEventBuilder builder = GitHubWebhookProjectEditedEventBuilder.builder(
                        ProjectCatalogFixtures.webhookProjectEditedEvent())
                .project(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("project");
    }
}
