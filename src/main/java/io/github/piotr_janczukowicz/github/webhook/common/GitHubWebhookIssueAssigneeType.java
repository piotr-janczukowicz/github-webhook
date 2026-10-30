package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The issue assignee type. */
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/issue/properties/assignee/properties/type")
public enum GitHubWebhookIssueAssigneeType {
    BOT("Bot"),
    USER("User"),
    ORGANIZATION("Organization"),
    MANNEQUIN("Mannequin"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookIssueAssigneeType> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookIssueAssigneeType.class, GitHubWebhookIssueAssigneeType::wireValue);

    private final String wireValue;

    GitHubWebhookIssueAssigneeType(final String wireValue) {
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
     * The issue assignee type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookIssueAssigneeType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
