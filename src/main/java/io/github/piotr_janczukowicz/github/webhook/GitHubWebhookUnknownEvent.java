package io.github.piotr_janczukowicz.github.webhook;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A webhook delivery whose event this library version does not know (a new kind of event, or a missing or unexpected
 * {@code X-GitHub-Event} header), or a known event without actions whose body does not fit its record (a required
 * property is missing, or a union found no member). A new kind of event does not fail decoding, so a service keeps
 * running when GitHub adds one. The decoder logs the second case at {@code WARN}, and
 * {@link GitHubWebhookDelivery#fallbackReason()} tells it from the first.
 *
 * @param eventName value of the {@code X-GitHub-Event} header, or {@code null} when there was none
 * @param payload the body as GitHub sent it
 */
public record GitHubWebhookUnknownEvent(@Nullable String eventName, Map<String, Object> payload)
        implements GitHubWebhookEvent {

    public GitHubWebhookUnknownEvent {
        requireNonNull(payload, "payload");
    }
}
