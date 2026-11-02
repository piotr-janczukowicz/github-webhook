package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookIssuesEditedChanges fixture = CommonCatalogFixtures.webhookIssuesEditedChanges();

        final GitHubWebhookIssuesEditedChanges copy =
                GitHubWebhookIssuesEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
