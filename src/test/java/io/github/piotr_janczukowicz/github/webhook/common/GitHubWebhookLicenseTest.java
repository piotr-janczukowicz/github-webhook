package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookLicenseTest {

    @Test
    void constructor_shouldThrow_whenKeyNull() {
        final GitHubWebhookLicenseBuilder builder = GitHubWebhookLicenseBuilder.builder(
                        CommonCatalogFixtures.webhookLicense())
                .key(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("key");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookLicenseBuilder builder = GitHubWebhookLicenseBuilder.builder(
                        CommonCatalogFixtures.webhookLicense())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookLicenseBuilder builder = GitHubWebhookLicenseBuilder.builder(
                        CommonCatalogFixtures.webhookLicense())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenSpdxIdNull() {
        final GitHubWebhookLicenseBuilder builder = GitHubWebhookLicenseBuilder.builder(
                        CommonCatalogFixtures.webhookLicense())
                .spdxId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("spdxId");
    }
}
