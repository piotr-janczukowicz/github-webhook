package io.github.piotr_janczukowicz.github.webhook.discussion;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDiscussionCategory;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChanges;
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

final class DiscussionCatalogFixtures {

    private DiscussionCatalogFixtures() {
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

    static GitHubWebhookDiscussionAnsweredAnswer webhookDiscussionAnsweredAnswer() {
        return GitHubWebhookDiscussionAnsweredAnswerBuilder.builder()
                .authorAssociation(GitHubWebhookIssueAuthorAssociation.COLLABORATOR)
                .body("body")
                .childCommentCount(1L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .discussionId(1L)
                .htmlUrl("html_url")
                .id(1L)
                .nodeId("node_id")
                .reactions(webhookReactions())
                .repositoryUrl("repository_url")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookDiscussionAnsweredEvent webhookDiscussionAnsweredEvent() {
        return GitHubWebhookDiscussionAnsweredEventBuilder.builder()
                .answer(webhookDiscussionAnsweredAnswer())
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionCategoryChangedChanges webhookDiscussionCategoryChangedChanges() {
        return GitHubWebhookDiscussionCategoryChangedChangesBuilder.builder()
                .category(webhookDiscussionCategoryChangedChangesCategory())
                .build();
    }

    static GitHubWebhookDiscussionCategoryChangedChangesCategory webhookDiscussionCategoryChangedChangesCategory() {
        return GitHubWebhookDiscussionCategoryChangedChangesCategoryBuilder.builder()
                .from(webhookDiscussionCategory())
                .build();
    }

    static GitHubWebhookDiscussionCategoryChangedEvent webhookDiscussionCategoryChangedEvent() {
        return GitHubWebhookDiscussionCategoryChangedEventBuilder.builder()
                .changes(webhookDiscussionCategoryChangedChanges())
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionClosedEvent webhookDiscussionClosedEvent() {
        return GitHubWebhookDiscussionClosedEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionCreatedEvent webhookDiscussionCreatedEvent() {
        return GitHubWebhookDiscussionCreatedEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionDeletedEvent webhookDiscussionDeletedEvent() {
        return GitHubWebhookDiscussionDeletedEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionEditedEvent webhookDiscussionEditedEvent() {
        return GitHubWebhookDiscussionEditedEventBuilder.builder()
                .changes(webhookIssuesEditedChanges())
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionLabeledEvent webhookDiscussionLabeledEvent() {
        return GitHubWebhookDiscussionLabeledEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionLockedEvent webhookDiscussionLockedEvent() {
        return GitHubWebhookDiscussionLockedEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionPinnedEvent webhookDiscussionPinnedEvent() {
        return GitHubWebhookDiscussionPinnedEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionReopenedEvent webhookDiscussionReopenedEvent() {
        return GitHubWebhookDiscussionReopenedEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionTransferredChanges webhookDiscussionTransferredChanges() {
        return GitHubWebhookDiscussionTransferredChangesBuilder.builder()
                .newDiscussion(webhookDiscussion())
                .newRepository(webhookForkRepository())
                .build();
    }

    static GitHubWebhookDiscussionTransferredEvent webhookDiscussionTransferredEvent() {
        return GitHubWebhookDiscussionTransferredEventBuilder.builder()
                .changes(webhookDiscussionTransferredChanges())
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionUnansweredEvent webhookDiscussionUnansweredEvent() {
        return GitHubWebhookDiscussionUnansweredEventBuilder.builder()
                .discussion(webhookDiscussion())
                .oldAnswer(webhookDiscussionAnsweredAnswer())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionUnlabeledEvent webhookDiscussionUnlabeledEvent() {
        return GitHubWebhookDiscussionUnlabeledEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionUnlockedEvent webhookDiscussionUnlockedEvent() {
        return GitHubWebhookDiscussionUnlockedEventBuilder.builder()
                .discussion(webhookDiscussion())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDiscussionUnpinnedEvent webhookDiscussionUnpinnedEvent() {
        return GitHubWebhookDiscussionUnpinnedEventBuilder.builder()
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
