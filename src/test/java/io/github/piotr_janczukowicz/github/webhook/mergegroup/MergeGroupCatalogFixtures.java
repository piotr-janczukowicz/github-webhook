package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.OffsetDateTime;

final class MergeGroupCatalogFixtures {

    private MergeGroupCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookMergeGroup webhookMergeGroup() {
        return GitHubWebhookMergeGroupBuilder.builder()
                .baseRef("base_ref")
                .baseSha("base_sha")
                .headCommit(webhookSimpleCommit())
                .headRef("head_ref")
                .headSha("head_sha")
                .build();
    }

    static GitHubWebhookMergeGroupChecksRequestedEvent webhookMergeGroupChecksRequestedEvent() {
        return GitHubWebhookMergeGroupChecksRequestedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .mergeGroup(webhookMergeGroup())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMergeGroupDestroyedEvent webhookMergeGroupDestroyedEvent() {
        return GitHubWebhookMergeGroupDestroyedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .mergeGroup(webhookMergeGroup())
                .organization(webhookOrganizationSimple())
                .reason(GitHubWebhookMergeGroupDestroyedReason.MERGED)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSimpleCommit webhookSimpleCommit() {
        return GitHubWebhookSimpleCommitBuilder.builder()
                .author(webhookSimpleCommitAuthor())
                .committer(webhookSimpleCommitAuthor())
                .id("7638417db6d59f3c431d3e1f261cc637155684cd")
                .message("Fix #42")
                .timestamp(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                .treeId("tree_id")
                .build();
    }

    static GitHubWebhookSimpleCommitAuthor webhookSimpleCommitAuthor() {
        return GitHubWebhookSimpleCommitAuthorBuilder.builder()
                .email("monalisa.octocat@example.com")
                .name("Monalisa Octocat")
                .build();
    }
}
