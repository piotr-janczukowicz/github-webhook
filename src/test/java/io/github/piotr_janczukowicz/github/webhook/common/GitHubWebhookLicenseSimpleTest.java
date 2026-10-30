package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookLicenseSimpleTest {

    @Test
    void constructor_shouldThrow_whenKeyNull() {
        final GitHubWebhookLicenseSimpleBuilder builder = GitHubWebhookLicenseSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookLicenseSimple())
                .key(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("key");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookLicenseSimpleBuilder builder = GitHubWebhookLicenseSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookLicenseSimple())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookLicenseSimpleBuilder builder = GitHubWebhookLicenseSimpleBuilder.builder(
                        CommonCatalogFixtures.webhookLicenseSimple())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
