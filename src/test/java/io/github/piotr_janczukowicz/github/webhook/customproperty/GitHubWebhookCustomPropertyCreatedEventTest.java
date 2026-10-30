package io.github.piotr_janczukowicz.github.webhook.customproperty;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCustomPropertyCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenDefinitionNull() {
        final GitHubWebhookCustomPropertyCreatedEventBuilder builder =
                GitHubWebhookCustomPropertyCreatedEventBuilder.builder(
                                CustomPropertyCatalogFixtures.webhookCustomPropertyCreatedEvent())
                        .definition(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("definition");
    }
}
