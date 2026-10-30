package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDiscussionCategory;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedLabel;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookReactions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDiscussionState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDiscussionStateReason;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;

final class DiscussionCommentCatalogFixtures {

    private DiscussionCommentCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDiscussion webhookDiscussion() {
        return GitHubWebhookDiscussionBuilder.builder()
                .activeLockReason("active_lock_reason")
                .answerChosenAt("answer_chosen_at")
                .answerChosenBy(webhookUser())
                .answerHtmlUrl("answer_html_url")
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .category(webhookDiscussionCategory())
                .comments(1L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("html_url")
                .id(1L)
                .labels(List.of(webhookIssuesEditedLabel()))
                .locked(true)
                .nodeId("node_id")
                .number(1L)
                .reactions(webhookReactions())
                .repositoryUrl("repository_url")
                .state(GitHubWebhookDiscussionState.OPEN)
                .stateReason(GitHubWebhookDiscussionStateReason.RESOLVED)
                .timelineUrl("timeline_url")
                .title("title")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookDiscussionCommentCreatedEvent webhookDiscussionCommentCreatedEvent() {
        return GitHubWebhookDiscussionCommentCreatedEventBuilder.builder()
                .comment(webhookDiscussionCommentEditedComment())
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionCommentDeletedEvent webhookDiscussionCommentDeletedEvent() {
        return GitHubWebhookDiscussionCommentDeletedEventBuilder.builder()
                .comment(webhookDiscussionCommentEditedComment())
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionCommentEditedChanges webhookDiscussionCommentEditedChanges() {
        return GitHubWebhookDiscussionCommentEditedChangesBuilder.builder()
                .body(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookDiscussionCommentEditedComment webhookDiscussionCommentEditedComment() {
        return GitHubWebhookDiscussionCommentEditedCommentBuilder.builder()
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .childCommentCount(1L)
                .createdAt("created_at")
                .discussionId(1L)
                .htmlUrl("html_url")
                .id(1L)
                .nodeId("node_id")
                .parentId(1L)
                .reactions(webhookReactions())
                .repositoryUrl("repository_url")
                .updatedAt("updated_at")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookDiscussionCommentEditedEvent webhookDiscussionCommentEditedEvent() {
        return GitHubWebhookDiscussionCommentEditedEventBuilder.builder()
                .changes(webhookDiscussionCommentEditedChanges())
                .comment(webhookDiscussionCommentEditedComment())
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookUser webhookUser() {
        return GitHubWebhookUserBuilder.builder()
                .avatarUrl("https://api.github.com/avatar_url")
                .deleted(true)
                .email("email")
                .eventsUrl("https://api.github.com/events_url{/id}")
                .followersUrl("https://api.github.com/followers_url")
                .followingUrl("https://api.github.com/following_url{/id}")
                .gistsUrl("https://api.github.com/gists_url{/id}")
                .gravatarId("gravatar_id")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .login("login")
                .name("name")
                .nodeId("node_id")
                .organizationsUrl("https://api.github.com/organizations_url")
                .receivedEventsUrl("https://api.github.com/received_events_url")
                .reposUrl("https://api.github.com/repos_url")
                .siteAdmin(true)
                .starredUrl("https://api.github.com/starred_url{/id}")
                .subscriptionsUrl("https://api.github.com/subscriptions_url")
                .type(GitHubWebhookUserType.BOT)
                .url("https://api.github.com/url")
                .userViewType("user_view_type")
                .build();
    }
}
