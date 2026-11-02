package io.github.piotr_janczukowicz.github.webhook.member;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMemberEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookMemberEditedChanges fixture = MemberCatalogFixtures.webhookMemberEditedChanges();

        final GitHubWebhookMemberEditedChanges copy =
                GitHubWebhookMemberEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
