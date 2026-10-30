package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCustomPropertyValueTest {

    @Test
    void constructor_shouldThrow_whenPropertyNameNull() {
        final GitHubWebhookCustomPropertyValueBuilder builder = GitHubWebhookCustomPropertyValueBuilder.builder(
                        CommonCatalogFixtures.webhookCustomPropertyValue())
                .propertyName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("propertyName");
    }
}
