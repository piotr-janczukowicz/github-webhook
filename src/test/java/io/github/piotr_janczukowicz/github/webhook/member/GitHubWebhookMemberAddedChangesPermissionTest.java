package io.github.piotr_janczukowicz.github.webhook.member;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMemberAddedChangesPermissionTest {

    @Test
    void constructor_shouldThrow_whenToNull() {
        final GitHubWebhookMemberAddedChangesPermissionBuilder builder =
                GitHubWebhookMemberAddedChangesPermissionBuilder.builder(
                                MemberCatalogFixtures.webhookMemberAddedChangesPermission())
                        .to(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("to");
    }
}
