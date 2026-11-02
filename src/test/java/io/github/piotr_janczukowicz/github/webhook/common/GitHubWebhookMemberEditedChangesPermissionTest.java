package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMemberEditedChangesPermissionTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookMemberEditedChangesPermission fixture =
                CommonCatalogFixtures.webhookMemberEditedChangesPermission();

        final GitHubWebhookMemberEditedChangesPermission copy =
                GitHubWebhookMemberEditedChangesPermissionBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
