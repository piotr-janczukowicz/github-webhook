package io.github.piotr_janczukowicz.github.webhook.member;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMemberAddedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookMemberAddedChanges fixture = MemberCatalogFixtures.webhookMemberAddedChanges();

        final GitHubWebhookMemberAddedChanges copy =
                GitHubWebhookMemberAddedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
