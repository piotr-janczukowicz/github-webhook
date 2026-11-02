package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardMovedChangesColumnIdTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectCardMovedChangesColumnId fixture =
                ProjectCardCatalogFixtures.webhookProjectCardMovedChangesColumnId();

        final GitHubWebhookProjectCardMovedChangesColumnId copy =
                GitHubWebhookProjectCardMovedChangesColumnIdBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
