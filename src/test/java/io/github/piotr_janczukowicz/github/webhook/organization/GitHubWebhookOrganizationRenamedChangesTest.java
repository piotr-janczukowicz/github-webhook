package io.github.piotr_janczukowicz.github.webhook.organization;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationRenamedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookOrganizationRenamedChanges fixture =
                OrganizationCatalogFixtures.webhookOrganizationRenamedChanges();

        final GitHubWebhookOrganizationRenamedChanges copy =
                GitHubWebhookOrganizationRenamedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
