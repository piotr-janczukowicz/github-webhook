package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSponsorshipEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookSponsorshipEditedChanges fixture =
                SponsorshipCatalogFixtures.webhookSponsorshipEditedChanges();

        final GitHubWebhookSponsorshipEditedChanges copy =
                GitHubWebhookSponsorshipEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
