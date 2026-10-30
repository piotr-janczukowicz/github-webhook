package io.github.piotr_janczukowicz.github.webhook.organizationcustompropertyvalues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventTest {

    @Test
    void constructor_shouldThrow_whenEnterpriseNull() {
        final GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder builder =
                GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder.builder(
                                OrganizationCustomPropertyValuesCatalogFixtures
                                        .webhookOrganizationCustomPropertyValuesUpdatedEvent())
                        .enterprise(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("enterprise");
    }

    @Test
    void constructor_shouldThrow_whenNewPropertyValuesNull() {
        final GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder builder =
                GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder.builder(
                                OrganizationCustomPropertyValuesCatalogFixtures
                                        .webhookOrganizationCustomPropertyValuesUpdatedEvent())
                        .newPropertyValues(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("newPropertyValues");
    }

    @Test
    void constructor_shouldThrow_whenOldPropertyValuesNull() {
        final GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder builder =
                GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder.builder(
                                OrganizationCustomPropertyValuesCatalogFixtures
                                        .webhookOrganizationCustomPropertyValuesUpdatedEvent())
                        .oldPropertyValues(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("oldPropertyValues");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder builder =
                GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder.builder(
                                OrganizationCustomPropertyValuesCatalogFixtures
                                        .webhookOrganizationCustomPropertyValuesUpdatedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }
}
