package io.github.piotr_janczukowicz.github.webhook.sponsorship;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDeploymentReviewApprovedApprover;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;

final class SponsorshipCatalogFixtures {

    private SponsorshipCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookSponsorshipCancelledEvent webhookSponsorshipCancelledEvent() {
        return GitHubWebhookSponsorshipCancelledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .sponsorship(webhookSponsorshipEditedSponsorship())
                .build();
    }

    static GitHubWebhookSponsorshipCreatedEvent webhookSponsorshipCreatedEvent() {
        return GitHubWebhookSponsorshipCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .sponsorship(webhookSponsorshipEditedSponsorship())
                .build();
    }

    static GitHubWebhookSponsorshipEditedChanges webhookSponsorshipEditedChanges() {
        return GitHubWebhookSponsorshipEditedChangesBuilder.builder()
                .privacyLevel(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookSponsorshipEditedEvent webhookSponsorshipEditedEvent() {
        return GitHubWebhookSponsorshipEditedEventBuilder.builder()
                .changes(webhookSponsorshipEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .sponsorship(webhookSponsorshipEditedSponsorship())
                .build();
    }

    static GitHubWebhookSponsorshipEditedSponsorship webhookSponsorshipEditedSponsorship() {
        return GitHubWebhookSponsorshipEditedSponsorshipBuilder.builder()
                .createdAt("created_at")
                .maintainer(webhookDeploymentReviewApprovedApprover())
                .nodeId("node_id")
                .privacyLevel("privacy_level")
                .sponsor(webhookUser())
                .sponsorable(webhookUser())
                .tier(webhookSponsorshipTier())
                .build();
    }

    static GitHubWebhookSponsorshipPendingCancellationEvent webhookSponsorshipPendingCancellationEvent() {
        return GitHubWebhookSponsorshipPendingCancellationEventBuilder.builder()
                .effectiveDate("effective_date")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .sponsorship(webhookSponsorshipEditedSponsorship())
                .build();
    }

    static GitHubWebhookSponsorshipPendingTierChangeEvent webhookSponsorshipPendingTierChangeEvent() {
        return GitHubWebhookSponsorshipPendingTierChangeEventBuilder.builder()
                .changes(webhookSponsorshipTierChangedChanges())
                .effectiveDate("effective_date")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .sponsorship(webhookSponsorshipEditedSponsorship())
                .build();
    }

    static GitHubWebhookSponsorshipTier webhookSponsorshipTier() {
        return GitHubWebhookSponsorshipTierBuilder.builder()
                .createdAt("created_at")
                .description("description")
                .isCustomAmmount(true)
                .isCustomAmount(true)
                .isOneTime(true)
                .monthlyPriceInCents(1L)
                .monthlyPriceInDollars(1L)
                .name("name")
                .nodeId("node_id")
                .build();
    }

    static GitHubWebhookSponsorshipTierChangedChanges webhookSponsorshipTierChangedChanges() {
        return GitHubWebhookSponsorshipTierChangedChangesBuilder.builder()
                .tier(webhookSponsorshipTierChangedChangesTier())
                .build();
    }

    static GitHubWebhookSponsorshipTierChangedChangesTier webhookSponsorshipTierChangedChangesTier() {
        return GitHubWebhookSponsorshipTierChangedChangesTierBuilder.builder()
                .from(webhookSponsorshipTier())
                .build();
    }

    static GitHubWebhookSponsorshipTierChangedEvent webhookSponsorshipTierChangedEvent() {
        return GitHubWebhookSponsorshipTierChangedEventBuilder.builder()
                .changes(webhookSponsorshipTierChangedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .sponsorship(webhookSponsorshipEditedSponsorship())
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
