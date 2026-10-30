package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@UnitTest
class GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEventTest {

    @ParameterizedTest
    @CsvSource({
        "'branch_protection_rule',BRANCH_PROTECTION_RULE",
        "'check_run',CHECK_RUN",
        "'check_suite',CHECK_SUITE",
        "'code_scanning_alert',CODE_SCANNING_ALERT",
        "'commit_comment',COMMIT_COMMENT",
        "'content_reference',CONTENT_REFERENCE",
        "'create',CREATE",
        "'delete',DELETE",
        "'deployment',DEPLOYMENT",
        "'deployment_review',DEPLOYMENT_REVIEW",
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
        "'milestone',MILESTONE",
        "'organization',ORGANIZATION",
        "'org_block',ORG_BLOCK",
        "'page_build',PAGE_BUILD",
        "'project',PROJECT",
        "'project_card',PROJECT_CARD",
        "'project_column',PROJECT_COLUMN",
        "'public',PUBLIC",
        "'pull_request',PULL_REQUEST",
        "'pull_request_review',PULL_REQUEST_REVIEW",
        "'pull_request_review_comment',PULL_REQUEST_REVIEW_COMMENT",
        "'push',PUSH",
        "'registry_package',REGISTRY_PACKAGE",
        "'release',RELEASE",
        "'repository',REPOSITORY",
        "'repository_dispatch',REPOSITORY_DISPATCH",
        "'secret_scanning_alert',SECRET_SCANNING_ALERT",
        "'star',STAR",
        "'status',STATUS",
        "'team',TEAM",
        "'team_add',TEAM_ADD",
        "'watch',WATCH",
        "'workflow_dispatch',WORKFLOW_DISPATCH",
        "'workflow_run',WORKFLOW_RUN",
        "'reminder',REMINDER",
        "'pull_request_review_thread',PULL_REQUEST_REVIEW_THREAD"
    })
    void fromWire_shouldReturnConstant_whenKnownValue(
            final String wire, final GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent value) {
        final GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent decoded =
                GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent.fromWire(wire);

        assertSoftly(softly -> {
            softly.assertThat(decoded).isEqualTo(value);
            softly.assertThat(decoded.wireValue()).isEqualTo(wire);
        });
    }

    @Test
    void fromWire_shouldReturnUnknown_whenValueNotKnown() {
        final GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent decoded =
                GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent.fromWire(
                        "a value this library does not know");

        assertThat(decoded).isEqualTo(GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent.UNKNOWN);
    }

    @Test
    void fromWire_shouldThrowNullPointerException_whenValueNull() {
        final Throwable thrown =
                catchThrowable(() -> GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent.fromWire(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
