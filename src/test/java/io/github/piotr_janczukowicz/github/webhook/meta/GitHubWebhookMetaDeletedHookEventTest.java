package io.github.piotr_janczukowicz.github.webhook.meta;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookMetaDeletedHookEventTest {

    @ParameterizedTest
    @CsvSource({
        "'*',EMPTY",
        "'branch_protection_rule',BRANCH_PROTECTION_RULE",
        "'check_run',CHECK_RUN",
        "'check_suite',CHECK_SUITE",
        "'code_scanning_alert',CODE_SCANNING_ALERT",
        "'commit_comment',COMMIT_COMMENT",
        "'create',CREATE",
        "'delete',DELETE",
        "'deployment',DEPLOYMENT",
        "'deployment_status',DEPLOYMENT_STATUS",
        "'deploy_key',DEPLOY_KEY",
        "'discussion',DISCUSSION",
        "'discussion_comment',DISCUSSION_COMMENT",
        "'fork',FORK",
        "'gollum',GOLLUM",
        "'issues',ISSUES",
        "'issue_comment',ISSUE_COMMENT",
        "'label',LABEL",
        "'member',MEMBER",
        "'membership',MEMBERSHIP",
        "'meta',META",
        "'milestone',MILESTONE",
        "'organization',ORGANIZATION",
        "'org_block',ORG_BLOCK",
        "'package',PACKAGE",
        "'page_build',PAGE_BUILD",
        "'project',PROJECT",
        "'project_card',PROJECT_CARD",
        "'project_column',PROJECT_COLUMN",
        "'public',PUBLIC",
        "'pull_request',PULL_REQUEST",
        "'pull_request_review',PULL_REQUEST_REVIEW",
        "'pull_request_review_comment',PULL_REQUEST_REVIEW_COMMENT",
        "'pull_request_review_thread',PULL_REQUEST_REVIEW_THREAD",
        "'push',PUSH",
        "'registry_package',REGISTRY_PACKAGE",
        "'release',RELEASE",
        "'repository',REPOSITORY",
        "'repository_import',REPOSITORY_IMPORT",
        "'repository_vulnerability_alert',REPOSITORY_VULNERABILITY_ALERT",
        "'secret_scanning_alert',SECRET_SCANNING_ALERT",
        "'secret_scanning_alert_location',SECRET_SCANNING_ALERT_LOCATION",
        "'security_and_analysis',SECURITY_AND_ANALYSIS",
        "'star',STAR",
        "'status',STATUS",
        "'team',TEAM",
        "'team_add',TEAM_ADD",
        "'watch',WATCH",
        "'workflow_job',WORKFLOW_JOB",
        "'workflow_run',WORKFLOW_RUN",
        "'repository_dispatch',REPOSITORY_DISPATCH",
        "'projects_v2_item',PROJECTS_V2_ITEM"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookMetaDeletedHookEvent value) {
        final GitHubWebhookMetaDeletedHookEvent decoded = GitHubWebhookMetaDeletedHookEvent.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookMetaDeletedHookEvent decoded =
                GitHubWebhookMetaDeletedHookEvent.fromWire("a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookMetaDeletedHookEvent.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookMetaDeletedHookEvent.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
