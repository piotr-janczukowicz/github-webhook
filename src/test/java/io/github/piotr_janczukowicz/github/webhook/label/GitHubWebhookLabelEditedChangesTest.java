package io.github.piotr_janczukowicz.github.webhook.label;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookLabelEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookLabelEditedChanges fixture = LabelCatalogFixtures.webhookLabelEditedChanges();

        final GitHubWebhookLabelEditedChanges copy =
                GitHubWebhookLabelEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
