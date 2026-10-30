package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * Explains why the merge group is being destroyed. The group could have been merged, removed from the queue (dequeued),
 * or invalidated by an earlier queue entry being dequeued (invalidated).
 */
@CatalogSchema("webhooks/merge-group-destroyed/requestBody/properties/reason")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public enum GitHubWebhookMergeGroupDestroyedReason {
    MERGED("merged"),
    INVALIDATED("invalidated"),
    DEQUEUED("dequeued"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookMergeGroupDestroyedReason> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookMergeGroupDestroyedReason.class, GitHubWebhookMergeGroupDestroyedReason::wireValue);

    private final String wireValue;

    GitHubWebhookMergeGroupDestroyedReason(final String wireValue) {
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
     * The merge group destroyed reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookMergeGroupDestroyedReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
