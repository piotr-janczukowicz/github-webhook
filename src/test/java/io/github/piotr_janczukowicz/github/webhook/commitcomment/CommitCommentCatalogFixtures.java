package io.github.piotr_janczukowicz.github.webhook.commitcomment;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookReactions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;

final class CommitCommentCatalogFixtures {

    private CommitCommentCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCommitCommentCreatedComment webhookCommitCommentCreatedComment() {
        return GitHubWebhookCommitCommentCreatedCommentBuilder.builder()
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .commitId("commit_id")
                .createdAt("created_at")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .line(1L)
                .nodeId("node_id")
                .path("path")
                .position(1L)
                .reactions(webhookReactions())
                .updatedAt("updated_at")
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookCommitCommentCreatedEvent webhookCommitCommentCreatedEvent() {
        return GitHubWebhookCommitCommentCreatedEventBuilder.builder()
                .comment(webhookCommitCommentCreatedComment())
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
