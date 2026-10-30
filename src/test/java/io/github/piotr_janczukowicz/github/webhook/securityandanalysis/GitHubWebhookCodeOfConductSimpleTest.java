package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCodeOfConductSimpleTest {

    @Test
    void constructor_shouldThrow_whenKeyNull() {
        final GitHubWebhookCodeOfConductSimpleBuilder builder = GitHubWebhookCodeOfConductSimpleBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookCodeOfConductSimple())
                .key(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("key");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookCodeOfConductSimpleBuilder builder = GitHubWebhookCodeOfConductSimpleBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookCodeOfConductSimple())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookCodeOfConductSimpleBuilder builder = GitHubWebhookCodeOfConductSimpleBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookCodeOfConductSimple())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
