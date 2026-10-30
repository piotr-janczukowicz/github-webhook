package io.github.piotr_janczukowicz.github.webhook.custompropertyvalues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCustomPropertyValuesUpdatedEventTest {

    @Test
    void constructor_shouldThrow_whenNewPropertyValuesNull() {
        final GitHubWebhookCustomPropertyValuesUpdatedEventBuilder builder =
                GitHubWebhookCustomPropertyValuesUpdatedEventBuilder.builder(
                                CustomPropertyValuesCatalogFixtures.webhookCustomPropertyValuesUpdatedEvent())
                        .newPropertyValues(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("newPropertyValues");
    }

    @Test
    void constructor_shouldThrow_whenOldPropertyValuesNull() {
        final GitHubWebhookCustomPropertyValuesUpdatedEventBuilder builder =
                GitHubWebhookCustomPropertyValuesUpdatedEventBuilder.builder(
                                CustomPropertyValuesCatalogFixtures.webhookCustomPropertyValuesUpdatedEvent())
                        .oldPropertyValues(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("oldPropertyValues");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookCustomPropertyValuesUpdatedEventBuilder builder =
                GitHubWebhookCustomPropertyValuesUpdatedEventBuilder.builder(
                                CustomPropertyValuesCatalogFixtures.webhookCustomPropertyValuesUpdatedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCustomPropertyValuesUpdatedEventBuilder builder =
                GitHubWebhookCustomPropertyValuesUpdatedEventBuilder.builder(
                                CustomPropertyValuesCatalogFixtures.webhookCustomPropertyValuesUpdatedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
