package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The pull request review comment created pull request requested reviewer: one of its members, told apart by the
 * properties it has.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(GitHubWebhookMilestoneCreator.class),
    @JsonSubTypes.Type(GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam.class)
})
public sealed interface GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewer
        permits GitHubWebhookMilestoneCreator,
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam {}
