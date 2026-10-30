package io.github.piotr_janczukowicz.github.webhook.push;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookEvent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCommitter;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The push event payload.
 *
 * @param after The SHA of the most recent commit on {@code ref} after the push.
 * @param baseRef base_ref
 * @param before The SHA of the most recent commit on {@code ref} before the push.
 * @param commits An array of commit objects describing the pushed commits. (Pushed commits are all commits that are
 *     included in the {@code compare} between the {@code before} commit and the {@code after} commit.) The array
 *     includes a maximum of 2048 commits. If necessary, you can use the [Commits
 *     API](https://docs.github.com/rest/commits) to fetch additional commits.
 * @param compare URL that shows the changes in this {@code ref} update, from the {@code before} commit to the
 *     {@code after} commit. For a newly created {@code ref} that is directly based on the default branch, this is the
 *     comparison between the head of the default branch and the {@code after} commit. Otherwise, this shows all commits
 *     until the {@code after} commit.
 * @param created Whether this push created the {@code ref}.
 * @param deleted Whether this push deleted the {@code ref}.
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param forced Whether this push was a force push of the {@code ref}.
 * @param headCommit head_commit
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param pusher Metaproperties for Git author/committer information.
 * @param ref The full git ref that was pushed. Example: {@code refs/heads/main} or {@code refs/tags/v3.14.1}.
 * @param repository A git repository
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/push/requestBody")
public record GitHubWebhookPushEvent(
        String after,
        @Nullable String baseRef,
        String before,
        List<GitHubWebhookCommit> commits,
        String compare,
        boolean created,
        boolean deleted,
        @Nullable GitHubWebhookEnterprise enterprise,
        boolean forced,
        @Nullable GitHubWebhookCommit headCommit,
        @Nullable GitHubWebhookSimpleInstallation installation,
        @Nullable GitHubWebhookOrganizationSimple organization,
        GitHubWebhookCommitter pusher,
        String ref,
        GitHubWebhookRepository repository,
        @Nullable GitHubWebhookSimpleUser sender)
        implements GitHubWebhookEvent {
    public GitHubWebhookPushEvent {
        requireNonNull(after, "after");
        requireNonNull(before, "before");
        requireNonNull(commits, "commits");
        requireNonNull(compare, "compare");
        requireNonNull(pusher, "pusher");
        requireNonNull(ref, "ref");
        requireNonNull(repository, "repository");
    }
}
