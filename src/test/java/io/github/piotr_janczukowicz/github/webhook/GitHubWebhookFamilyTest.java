package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.github.webhook.ping.GitHubWebhookPingEvent;
import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.util.Map;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookFamilyTest {

    @Test
    void single_shouldKeepTheRecordAndNoActions() {
        final GitHubWebhookFamily family = GitHubWebhookFamily.single(GitHubWebhookPingEvent.class);

        assertThat(family.single()).isEqualTo(GitHubWebhookPingEvent.class);
        assertThat(family.actions()).isEmpty();
        assertThat(family.unknownAction()).isNull();
    }

    @Test
    void single_shouldThrow_whenTypeNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookFamily.single(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("type");
    }

    @Test
    void withActions_shouldKeepTheActionsAndTheUnknownActionBuilder() {
        final GitHubWebhookFamily family = GitHubWebhookFamily.withActions(
                Map.of("opened", GitHubWebhookPingEvent.class), GitHubWebhookUnknownEvent::new);

        assertThat(family.single()).isNull();
        assertThat(family.actions()).containsOnlyKeys("opened");
        assertThat(family.unknownAction().apply("x", Map.of())).isEqualTo(new GitHubWebhookUnknownEvent("x", Map.of()));
    }

    @Test
    void unknown_shouldBuildTheUnknownActionRecord_whenFamilyHasActions() {
        final GitHubWebhookFamily family = GitHubWebhookFamily.withActions(
                Map.of("opened", GitHubWebhookPingEvent.class), GitHubWebhookUnknownEvent::new);

        final GitHubWebhookEvent event = family.unknown("issues", "future", Map.of("k", "v"));

        assertThat(event).isEqualTo(new GitHubWebhookUnknownEvent("future", Map.of("k", "v")));
    }

    @Test
    void unknown_shouldBuildTheUnknownEventWithTheHeader_whenFamilyHasNoActions() {
        final GitHubWebhookFamily family = GitHubWebhookFamily.single(GitHubWebhookPingEvent.class);

        final GitHubWebhookEvent event = family.unknown("ping", null, Map.of("k", "v"));

        assertThat(event).isEqualTo(new GitHubWebhookUnknownEvent("ping", Map.of("k", "v")));
    }

    @Test
    void withActions_shouldThrow_whenUnknownActionNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookFamily.withActions(Map.of(), null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("unknownAction");
    }

    @Test
    void constructor_shouldThrow_whenActionsNull() {
        final Throwable thrown = catchThrowable(() -> new GitHubWebhookFamily(null, null, null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("actions");
    }
}
