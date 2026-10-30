package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The default value for a squash merge commit message: - {@code PR_BODY} - default to the pull request's body. -
 * {@code COMMIT_MESSAGES} - default to the branch's commit messages. - {@code BLANK} - default to a blank commit
 * message.
 */
@CatalogSchema(
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/squash_merge_commit_message")
public enum GitHubWebhookRepositorySquashMergeCommitMessage {
    PR_BODY("PR_BODY"),
    COMMIT_MESSAGES("COMMIT_MESSAGES"),
    BLANK("BLANK"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositorySquashMergeCommitMessage> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookRepositorySquashMergeCommitMessage.class,
                    GitHubWebhookRepositorySquashMergeCommitMessage::wireValue);

    private final String wireValue;

    GitHubWebhookRepositorySquashMergeCommitMessage(final String wireValue) {
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
     * The repository squash merge commit message from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositorySquashMergeCommitMessage fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
