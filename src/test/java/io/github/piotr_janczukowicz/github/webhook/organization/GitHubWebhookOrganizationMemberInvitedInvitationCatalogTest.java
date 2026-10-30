package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationMemberInvitedInvitationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationMemberInvitedInvitation.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-member-invited-invitation.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-member-invited-invitation-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCatalogFixtures.webhookOrganizationMemberInvitedInvitation();
    }
}
