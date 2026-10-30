package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookFlavorTest {

    @Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHES})
    record Annotated() {}

    @Test
    void values_shouldListEveryProductThatSendsWebhooksInTheOrderOfTheTable() {
        final GitHubWebhookFlavor[] values = GitHubWebhookFlavor.values();

        assertThat(values)
                .containsExactly(GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES);
    }

    @Test
    void flavors_shouldBeReadableAtRuntimeFromAType() {
        final Flavors flavors = Annotated.class.getAnnotation(Flavors.class);

        assertThat(flavors.value()).containsExactly(GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHES);
    }

    @Test
    void flavors_shouldBeARuntimeAnnotationOnTypesOnly() {
        final Retention retention = Flavors.class.getAnnotation(Retention.class);
        final Target target = Flavors.class.getAnnotation(Target.class);

        assertThat(retention.value()).isEqualTo(RetentionPolicy.RUNTIME);
        assertThat(target.value()).containsExactly(java.lang.annotation.ElementType.TYPE);
    }
}
