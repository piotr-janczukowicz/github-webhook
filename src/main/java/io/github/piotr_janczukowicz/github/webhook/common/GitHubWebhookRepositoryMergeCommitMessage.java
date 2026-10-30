package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The default value for a merge commit message. - {@code PR_TITLE} - default to the pull request's title. -
 * {@code PR_BODY} - default to the pull request's body. - {@code BLANK} - default to a blank commit message.
 */
@CatalogSchema(
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/merge_commit_message")
public enum GitHubWebhookRepositoryMergeCommitMessage {
    PR_BODY("PR_BODY"),
    PR_TITLE("PR_TITLE"),
    BLANK("BLANK"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryMergeCommitMessage> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookRepositoryMergeCommitMessage.class, GitHubWebhookRepositoryMergeCommitMessage::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryMergeCommitMessage(final String wireValue) {
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
     * The repository merge commit message from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryMergeCommitMessage fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
