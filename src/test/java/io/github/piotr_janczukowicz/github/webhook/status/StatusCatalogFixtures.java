package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.util.List;

final class StatusCatalogFixtures {

    private StatusCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCommitter webhookCommitter() {
        return GitHubWebhookCommitterBuilder.builder()
                .date("date")
                .email("email")
                .name("name")
                .username("username")
                .build();
    }

    static GitHubWebhookStatusBranch webhookStatusBranch() {
        return GitHubWebhookStatusBranchBuilder.builder()
                .commit(webhookStatusBranchCommit())
                .name("name")
                .protectedValue(true)
                .build();
    }

    static GitHubWebhookStatusBranchCommit webhookStatusBranchCommit() {
        return GitHubWebhookStatusBranchCommitBuilder.builder()
                .sha("sha")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookStatusCommit webhookStatusCommit() {
        return GitHubWebhookStatusCommitBuilder.builder()
                .author(webhookUser())
                .commentsUrl("https://api.github.com/comments_url")
                .commit(webhookStatusCommitValue())
                .committer(webhookUser())
                .htmlUrl("https://api.github.com/html_url")
                .nodeId("node_id")
                .parents(List.of(webhookStatusCommitParent()))
                .sha("sha")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookStatusCommitParent webhookStatusCommitParent() {
        return GitHubWebhookStatusCommitParentBuilder.builder()
                .htmlUrl("https://api.github.com/html_url")
                .sha("sha")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookStatusCommitValue webhookStatusCommitValue() {
        return GitHubWebhookStatusCommitValueBuilder.builder()
                .author(webhookCommitter())
                .commentCount(1L)
                .committer(webhookCommitter())
                .message("message")
                .tree(webhookStatusCommitValueTree())
                .url("https://api.github.com/url")
                .verification(webhookStatusCommitValueVerification())
                .build();
    }

    static GitHubWebhookStatusCommitValueTree webhookStatusCommitValueTree() {
        return GitHubWebhookStatusCommitValueTreeBuilder.builder()
                .sha("sha")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookStatusCommitValueVerification webhookStatusCommitValueVerification() {
        return GitHubWebhookStatusCommitValueVerificationBuilder.builder()
                .payload("payload")
                .reason(GitHubWebhookStatusCommitValueVerificationReason.EXPIRED_KEY)
                .signature("signature")
                .verified(true)
                .verifiedAt("verified_at")
                .build();
    }

    static GitHubWebhookStatusEvent webhookStatusEvent() {
        return GitHubWebhookStatusEventBuilder.builder()
                .avatarUrl("https://api.github.com/avatar_url")
                .branches(List.of(webhookStatusBranch()))
                .commit(webhookStatusCommit())
                .context("context")
                .createdAt("created_at")
                .description("description")
                .enterprise(webhookEnterprise())
                .id(1L)
                .installation(webhookSimpleInstallation())
                .name("name")
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .sha("sha")
                .state(GitHubWebhookStatusState.PENDING)
                .targetUrl("target_url")
                .updatedAt("updated_at")
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
                .build();
    }
}
