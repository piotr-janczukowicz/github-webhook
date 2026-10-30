package io.github.piotr_janczukowicz.github.webhook.customproperty;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationCustomPropertyTest {

    @Test
    void constructor_shouldThrow_whenPropertyNameNull() {
        final GitHubWebhookOrganizationCustomPropertyBuilder builder =
                GitHubWebhookOrganizationCustomPropertyBuilder.builder(
                                CustomPropertyCatalogFixtures.webhookOrganizationCustomProperty())
                        .propertyName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("propertyName");
    }

    @Test
    void constructor_shouldThrow_whenValueTypeNull() {
        final GitHubWebhookOrganizationCustomPropertyBuilder builder =
                GitHubWebhookOrganizationCustomPropertyBuilder.builder(
                                CustomPropertyCatalogFixtures.webhookOrganizationCustomProperty())
                        .valueType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("valueType");
    }
}
