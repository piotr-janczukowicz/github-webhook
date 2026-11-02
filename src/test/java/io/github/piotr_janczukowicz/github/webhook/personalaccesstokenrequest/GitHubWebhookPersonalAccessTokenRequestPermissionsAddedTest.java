package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPersonalAccessTokenRequestPermissionsAddedTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPersonalAccessTokenRequestPermissionsAdded fixture =
                PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequestPermissionsAdded();

        final GitHubWebhookPersonalAccessTokenRequestPermissionsAdded copy =
                GitHubWebhookPersonalAccessTokenRequestPermissionsAddedBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
