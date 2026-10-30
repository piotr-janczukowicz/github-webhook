package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestReviewCommentLinks;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestReviewCommentSide;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestReviewCommentSubjectType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookReactions;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The [comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request) itself.
 *
 * @param links _links
 * @param authorAssociation How the author is associated with the repository.
 * @param body The text of the comment.
 * @param commitId The SHA of the commit to which the comment applies.
 * @param createdAt created_at
 * @param diffHunk The diff of the line that the comment refers to.
 * @param htmlUrl HTML URL for the pull request review comment.
 * @param id The ID of the pull request review comment.
 * @param inReplyToId The comment ID to reply to.
 * @param line The line of the blob to which the comment applies. The last line of the range for a multi-line comment
 * @param nodeId The node ID of the pull request review comment.
 * @param originalCommitId The SHA of the original commit to which the comment applies.
 * @param originalLine The line of the blob to which the comment applies. The last line of the range for a multi-line
 *     comment
 * @param originalPosition The index of the original line in the diff to which the comment applies.
 * @param originalStartLine The first line of the range for a multi-line comment.
 * @param path The relative path of the file to which the comment applies.
 * @param position The line index in the diff to which the comment applies.
 * @param pullRequestReviewId The ID of the pull request review to which the comment belongs.
 * @param pullRequestUrl URL for the pull request that the review comment belongs to.
 * @param reactions reactions
 * @param side The side of the first line of the range for a multi-line comment.
 * @param startLine The first line of the range for a multi-line comment.
 * @param startSide The side of the first line of the range for a multi-line comment.
 * @param subjectType The level at which the comment is targeted, can be a diff line or a file.
 * @param updatedAt updated_at
 * @param url URL for the pull request review comment
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-comment-deleted/requestBody/properties/comment")
public record GitHubWebhookPullRequestReviewComment(
        @JsonProperty("_links") GitHubWebhookPullRequestReviewCommentLinks links,
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        String body,
        String commitId,
        Instant createdAt,
        String diffHunk,
        String htmlUrl,
        long id,
        @Nullable Long inReplyToId,
        @Nullable Long line,
        String nodeId,
        String originalCommitId,
        long originalLine,
        long originalPosition,
        @Nullable Long originalStartLine,
        String path,
        @Nullable Long position,
        @Nullable Long pullRequestReviewId,
        String pullRequestUrl,
        GitHubWebhookReactions reactions,
        GitHubWebhookPullRequestReviewCommentSide side,
        @Nullable Long startLine,
        @Nullable GitHubWebhookPullRequestReviewCommentSide startSide,
        @Nullable GitHubWebhookPullRequestReviewCommentSubjectType subjectType,
        Instant updatedAt,
        String url,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookPullRequestReviewComment {
        requireNonNull(links, "links");
        requireNonNull(authorAssociation, "authorAssociation");
        requireNonNull(body, "body");
        requireNonNull(commitId, "commitId");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(diffHunk, "diffHunk");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(originalCommitId, "originalCommitId");
        requireNonNull(path, "path");
        requireNonNull(pullRequestUrl, "pullRequestUrl");
        requireNonNull(reactions, "reactions");
        requireNonNull(side, "side");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
