package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of content tracked in a project item */
@CatalogSchema("webhooks/projects-v2-item-archived/requestBody/properties/projects_v2_item/properties/content_type")
public enum GitHubWebhookProjectsV2ItemContentType {
    ISSUE("Issue"),
    PULLREQUEST("PullRequest"),
    DRAFTISSUE("DraftIssue"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookProjectsV2ItemContentType> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookProjectsV2ItemContentType.class, GitHubWebhookProjectsV2ItemContentType::wireValue);

    private final String wireValue;

    GitHubWebhookProjectsV2ItemContentType(final String wireValue) {
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
     * The projects v2 item content type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookProjectsV2ItemContentType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
