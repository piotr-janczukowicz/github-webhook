package io.github.piotr_janczukowicz.github.webhook.meta;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The meta deleted hook event. */
@CatalogSchema("webhooks/meta-deleted/requestBody/properties/hook/properties/events/items")
public enum GitHubWebhookMetaDeletedHookEvent {
    EMPTY("*"),
    BRANCH_PROTECTION_RULE("branch_protection_rule"),
    CHECK_RUN("check_run"),
    CHECK_SUITE("check_suite"),
    CODE_SCANNING_ALERT("code_scanning_alert"),
    COMMIT_COMMENT("commit_comment"),
    CREATE("create"),
    DELETE("delete"),
    DEPLOYMENT("deployment"),
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
    META("meta"),
    MILESTONE("milestone"),
    ORGANIZATION("organization"),
    ORG_BLOCK("org_block"),
    PACKAGE("package"),
    PAGE_BUILD("page_build"),
    PROJECT("project"),
    PROJECT_CARD("project_card"),
    PROJECT_COLUMN("project_column"),
    PUBLIC("public"),
    PULL_REQUEST("pull_request"),
    PULL_REQUEST_REVIEW("pull_request_review"),
    PULL_REQUEST_REVIEW_COMMENT("pull_request_review_comment"),
    PULL_REQUEST_REVIEW_THREAD("pull_request_review_thread"),
    PUSH("push"),
    REGISTRY_PACKAGE("registry_package"),
    RELEASE("release"),
    REPOSITORY("repository"),
    REPOSITORY_IMPORT("repository_import"),
    REPOSITORY_VULNERABILITY_ALERT("repository_vulnerability_alert"),
    SECRET_SCANNING_ALERT("secret_scanning_alert"),
    SECRET_SCANNING_ALERT_LOCATION("secret_scanning_alert_location"),
    SECURITY_AND_ANALYSIS("security_and_analysis"),
    STAR("star"),
    STATUS("status"),
    TEAM("team"),
    TEAM_ADD("team_add"),
    WATCH("watch"),
    WORKFLOW_JOB("workflow_job"),
    WORKFLOW_RUN("workflow_run"),
    REPOSITORY_DISPATCH("repository_dispatch"),
    PROJECTS_V2_ITEM("projects_v2_item"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookMetaDeletedHookEvent> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookMetaDeletedHookEvent.class, GitHubWebhookMetaDeletedHookEvent::wireValue);

    private final String wireValue;

    GitHubWebhookMetaDeletedHookEvent(final String wireValue) {
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
     * The meta deleted hook event from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookMetaDeletedHookEvent fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
