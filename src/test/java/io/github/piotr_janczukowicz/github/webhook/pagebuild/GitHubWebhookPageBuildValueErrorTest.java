package io.github.piotr_janczukowicz.github.webhook.pagebuild;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPageBuildValueErrorTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPageBuildValueError fixture = PageBuildCatalogFixtures.webhookPageBuildValueError();

        final GitHubWebhookPageBuildValueError copy =
                GitHubWebhookPageBuildValueErrorBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
