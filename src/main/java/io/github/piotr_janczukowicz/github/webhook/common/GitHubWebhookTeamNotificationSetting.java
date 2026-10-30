package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** Whether team members will receive notifications when their team is @mentioned */
@CatalogSchema("webhooks/membership-added/requestBody/properties/team/properties/notification_setting")
public enum GitHubWebhookTeamNotificationSetting {
    NOTIFICATIONS_ENABLED("notifications_enabled"),
    NOTIFICATIONS_DISABLED("notifications_disabled"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookTeamNotificationSetting> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookTeamNotificationSetting.class, GitHubWebhookTeamNotificationSetting::wireValue);

    private final String wireValue;

    GitHubWebhookTeamNotificationSetting(final String wireValue) {
        this.wireValue = wireValue;
    }

    /**
     * Value GitHub sends in JSON.
     *
     * @return wire string
     */
    @JsonValue
    public String wireValue() {
        return wireValue;
    }

    /**
     * The team notification setting from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookTeamNotificationSetting fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
