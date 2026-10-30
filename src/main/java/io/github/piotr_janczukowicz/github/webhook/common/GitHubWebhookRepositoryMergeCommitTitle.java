package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The default value for a merge commit title. - {@code PR_TITLE} - default to the pull request's title. -
 * {@code MERGE_MESSAGE} - default to the classic title for a merge message (e.g., Merge pull request #123 from
 * branch-name).
 */
@CatalogSchema(
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/merge_commit_title")
public enum GitHubWebhookRepositoryMergeCommitTitle {
    PR_TITLE("PR_TITLE"),
    MERGE_MESSAGE("MERGE_MESSAGE"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryMergeCommitTitle> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookRepositoryMergeCommitTitle.class, GitHubWebhookRepositoryMergeCommitTitle::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryMergeCommitTitle(final String wireValue) {
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
     * The repository merge commit title from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryMergeCommitTitle fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
