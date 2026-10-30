package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The data type of the issue field. */
@CatalogSchema("webhooks/issues-field-added/requestBody/properties/issue_field/properties/field_type")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public enum GitHubWebhookIssuesFieldAddedIssueFieldFieldType {
    TEXT("text"),
    DATE("date"),
    SINGLE_SELECT("single_select"),
    MULTI_SELECT("multi_select"),
    NUMBER("number"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookIssuesFieldAddedIssueFieldFieldType> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookIssuesFieldAddedIssueFieldFieldType.class,
                    GitHubWebhookIssuesFieldAddedIssueFieldFieldType::wireValue);

    private final String wireValue;

    GitHubWebhookIssuesFieldAddedIssueFieldFieldType(final String wireValue) {
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
     * The issues field added issue field field type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookIssuesFieldAddedIssueFieldFieldType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
