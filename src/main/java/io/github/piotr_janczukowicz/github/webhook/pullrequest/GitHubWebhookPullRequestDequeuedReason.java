package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The pull request dequeued reason. */
@CatalogSchema("webhooks/pull-request-dequeued/requestBody/properties/reason")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public enum GitHubWebhookPullRequestDequeuedReason {
    UNKNOWN_REMOVAL_REASON("UNKNOWN_REMOVAL_REASON"),
    MANUAL("MANUAL"),
    MERGE("MERGE"),
    MERGE_CONFLICT("MERGE_CONFLICT"),
    CI_FAILURE("CI_FAILURE"),
    CI_TIMEOUT("CI_TIMEOUT"),
    ALREADY_MERGED("ALREADY_MERGED"),
    QUEUE_CLEARED("QUEUE_CLEARED"),
    ROLL_BACK("ROLL_BACK"),
    BRANCH_PROTECTIONS("BRANCH_PROTECTIONS"),
    GIT_TREE_INVALID("GIT_TREE_INVALID"),
    INVALID_MERGE_COMMIT("INVALID_MERGE_COMMIT"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookPullRequestDequeuedReason> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookPullRequestDequeuedReason.class, GitHubWebhookPullRequestDequeuedReason::wireValue);

    private final String wireValue;

    GitHubWebhookPullRequestDequeuedReason(final String wireValue) {
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
     * The pull request dequeued reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPullRequestDequeuedReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
