package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The list of events for the GitHub app */
@CatalogSchema(
        "webhooks/check-suite-rerequested/requestBody/properties/check_suite/properties/app/properties/events/items")
public enum GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEvent {
    BRANCH_PROTECTION_RULE("branch_protection_rule"),
    CHECK_RUN("check_run"),
    CHECK_SUITE("check_suite"),
    CODE_SCANNING_ALERT("code_scanning_alert"),
    COMMIT_COMMENT("commit_comment"),
    CONTENT_REFERENCE("content_reference"),
    CREATE("create"),
    DELETE("delete"),
    DEPLOYMENT("deployment"),
    DEPLOYMENT_REVIEW("deployment_review"),
    DEPLOYMENT_STATUS("deployment_status"),
    DEPLOY_KEY("deploy_key"),
    DISCUSSION("discussion"),
    DISCUSSION_COMMENT("discussion_comment"),
    FORK("fork"),
    GOLLUM("gollum"),
    ISSUES("issues"),
    ISSUE_COMMENT("issue_comment"),
    LABEL("label"),
    MEMBER("member"),
    MEMBERSHIP("membership"),
    MILESTONE("milestone"),
    ORGANIZATION("organization"),
    ORG_BLOCK("org_block"),
    PAGE_BUILD("page_build"),
    PROJECT("project"),
    PROJECT_CARD("project_card"),
    PROJECT_COLUMN("project_column"),
    PUBLIC("public"),
    PULL_REQUEST("pull_request"),
    PULL_REQUEST_REVIEW("pull_request_review"),
    PULL_REQUEST_REVIEW_COMMENT("pull_request_review_comment"),
    PUSH("push"),
    REGISTRY_PACKAGE("registry_package"),
    RELEASE("release"),
    REPOSITORY("repository"),
    REPOSITORY_DISPATCH("repository_dispatch"),
    SECRET_SCANNING_ALERT("secret_scanning_alert"),
    STAR("star"),
    STATUS("status"),
    TEAM("team"),
    TEAM_ADD("team_add"),
    WATCH("watch"),
    WORKFLOW_DISPATCH("workflow_dispatch"),
    WORKFLOW_RUN("workflow_run"),
    PULL_REQUEST_REVIEW_THREAD("pull_request_review_thread"),
    MERGE_QUEUE_ENTRY("merge_queue_entry"),
    WORKFLOW_JOB("workflow_job"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEvent> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEvent.class,
                    GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEvent::wireValue);

    private final String wireValue;

    GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEvent(final String wireValue) {
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
     * The check suite rerequested check suite app event from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEvent fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
