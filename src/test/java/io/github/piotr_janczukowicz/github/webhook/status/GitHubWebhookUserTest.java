package io.github.piotr_janczukowicz.github.webhook.status;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookUserTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookUser fixture = StatusCatalogFixtures.webhookUser();

        final GitHubWebhookUser copy = GitHubWebhookUserBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
