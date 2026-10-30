package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCustomPropertyForOrganizationTest {

    @Test
    void constructor_shouldThrow_whenPropertyNameNull() {
        final GitHubWebhookCustomPropertyForOrganizationBuilder builder =
                GitHubWebhookCustomPropertyForOrganizationBuilder.builder(
                                OrganizationCustomPropertyCatalogFixtures.webhookCustomPropertyForOrganization())
                        .propertyName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("propertyName");
    }

    @Test
    void constructor_shouldThrow_whenValueTypeNull() {
        final GitHubWebhookCustomPropertyForOrganizationBuilder builder =
                GitHubWebhookCustomPropertyForOrganizationBuilder.builder(
                                OrganizationCustomPropertyCatalogFixtures.webhookCustomPropertyForOrganization())
                        .valueType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("valueType");
    }
}
