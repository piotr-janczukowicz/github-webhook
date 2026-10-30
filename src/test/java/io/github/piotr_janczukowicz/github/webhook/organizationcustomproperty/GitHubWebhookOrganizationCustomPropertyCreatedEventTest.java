package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookOrganizationCustomPropertyCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenDefinitionNull() {
        final GitHubWebhookOrganizationCustomPropertyCreatedEventBuilder builder =
                GitHubWebhookOrganizationCustomPropertyCreatedEventBuilder.builder(
                                OrganizationCustomPropertyCatalogFixtures
                                        .webhookOrganizationCustomPropertyCreatedEvent())
                        .definition(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("definition");
    }

    @Test
    void constructor_shouldThrow_whenEnterpriseNull() {
        final GitHubWebhookOrganizationCustomPropertyCreatedEventBuilder builder =
                GitHubWebhookOrganizationCustomPropertyCreatedEventBuilder.builder(
                                OrganizationCustomPropertyCatalogFixtures
                                        .webhookOrganizationCustomPropertyCreatedEvent())
                        .enterprise(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("enterprise");
    }
}
