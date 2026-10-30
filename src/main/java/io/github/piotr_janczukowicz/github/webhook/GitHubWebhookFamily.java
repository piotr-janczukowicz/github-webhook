package io.github.piotr_janczukowicz.github.webhook;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;

/**
 * How one family of events is decoded: an action-less family has one record; a family with actions has one record for
 * each action and a way to build the unknown-action record.
 *
 * @param single the one record of a family without actions, or {@code null}
 * @param actions the record of each action of a family with actions
 * @param unknownAction builds the record for an action that is not in {@code actions}, or {@code null}
 */
record GitHubWebhookFamily(
        @Nullable Class<? extends GitHubWebhookEvent> single,
        Map<String, Class<? extends GitHubWebhookEvent>> actions,
        @Nullable BiFunction<@Nullable String, Map<String, Object>, GitHubWebhookEvent> unknownAction) {

    GitHubWebhookFamily {
        requireNonNull(actions, "actions");
    }

    /**
     * The event for a delivery that has no record: the unknown-action record of a family with actions, else the unknown
     * event.
     *
     * @param eventHeader value of the {@code X-GitHub-Event} header, or {@code null}
     * @param action the action of the body, or {@code null}
     * @param payload the body as a map
     * @return the unknown event of this family
     */
    GitHubWebhookEvent unknown(
            final @Nullable String eventHeader, final @Nullable String action, final Map<String, Object> payload) {
        return unknownAction == null
                ? new GitHubWebhookUnknownEvent(eventHeader, payload)
                : unknownAction.apply(action, payload);
    }

    static GitHubWebhookFamily single(final Class<? extends GitHubWebhookEvent> type) {
        return new GitHubWebhookFamily(requireNonNull(type, "type"), Map.of(), null);
    }

    static GitHubWebhookFamily withActions(
            final Map<String, Class<? extends GitHubWebhookEvent>> actions,
            final BiFunction<@Nullable String, Map<String, Object>, GitHubWebhookEvent> unknownAction) {
        return new GitHubWebhookFamily(null, actions, requireNonNull(unknownAction, "unknownAction"));
    }
}
