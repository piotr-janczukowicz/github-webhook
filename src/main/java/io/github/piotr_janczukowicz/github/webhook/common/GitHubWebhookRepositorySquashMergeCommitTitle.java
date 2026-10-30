package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The default value for a squash merge commit title: - {@code PR_TITLE} - default to the pull request's title. -
 * {@code COMMIT_OR_PR_TITLE} - default to the commit's title (if only one commit) or the pull request's title (when
 * more than one commit).
 */
@CatalogSchema(
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/squash_merge_commit_title")
public enum GitHubWebhookRepositorySquashMergeCommitTitle {
    PR_TITLE("PR_TITLE"),
    COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositorySquashMergeCommitTitle> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookRepositorySquashMergeCommitTitle.class,
                    GitHubWebhookRepositorySquashMergeCommitTitle::wireValue);

    private final String wireValue;

    GitHubWebhookRepositorySquashMergeCommitTitle(final String wireValue) {
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
     * The repository squash merge commit title from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositorySquashMergeCommitTitle fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
