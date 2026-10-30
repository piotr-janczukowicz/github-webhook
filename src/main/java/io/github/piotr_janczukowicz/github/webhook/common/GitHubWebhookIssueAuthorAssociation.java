package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** How the author is associated with the repository. */
@CatalogSchema("webhooks/commit-comment-created/requestBody/properties/comment/properties/author_association")
public enum GitHubWebhookIssueAuthorAssociation {
    COLLABORATOR("COLLABORATOR"),
    CONTRIBUTOR("CONTRIBUTOR"),
    FIRST_TIMER("FIRST_TIMER"),
    FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),
    MANNEQUIN("MANNEQUIN"),
    MEMBER("MEMBER"),
    NONE("NONE"),
    OWNER("OWNER"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookIssueAuthorAssociation> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookIssueAuthorAssociation.class, GitHubWebhookIssueAuthorAssociation::wireValue);

    private final String wireValue;

    GitHubWebhookIssueAuthorAssociation(final String wireValue) {
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
     * The issue author association from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookIssueAuthorAssociation fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
