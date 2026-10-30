package io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.util.List;

final class MarketplacePurchaseCatalogFixtures {

    private MarketplacePurchaseCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookMarketplacePurchase webhookMarketplacePurchase() {
        return GitHubWebhookMarketplacePurchaseBuilder.builder()
                .account(webhookMarketplacePurchaseAccount())
                .billingCycle("billing_cycle")
                .freeTrialEndsOn("free_trial_ends_on")
                .nextBillingDate("next_billing_date")
                .onFreeTrial(true)
                .plan(webhookMarketplacePurchasePlan())
                .unitCount(1L)
                .build();
    }

    static GitHubWebhookMarketplacePurchaseAccount webhookMarketplacePurchaseAccount() {
        return GitHubWebhookMarketplacePurchaseAccountBuilder.builder()
                .id(1L)
                .login("login")
                .nodeId("node_id")
                .organizationBillingEmail("organization_billing_email")
                .type("type")
                .build();
    }

    static GitHubWebhookMarketplacePurchaseCancelledEvent webhookMarketplacePurchaseCancelledEvent() {
        return GitHubWebhookMarketplacePurchaseCancelledEventBuilder.builder()
                .effectiveDate("effective_date")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .marketplacePurchase(webhookMarketplacePurchase())
                .organization(webhookOrganizationSimple())
                .previousMarketplacePurchase(webhookMarketplacePurchaseCancelledPreviousMarketplacePurchase())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMarketplacePurchaseCancelledPreviousMarketplacePurchase
            webhookMarketplacePurchaseCancelledPreviousMarketplacePurchase() {
        return GitHubWebhookMarketplacePurchaseCancelledPreviousMarketplacePurchaseBuilder.builder()
                .account(webhookMarketplacePurchaseAccount())
                .billingCycle("billing_cycle")
                .nextBillingDate("next_billing_date")
                .onFreeTrial(true)
                .plan(webhookMarketplacePurchasePlan())
                .unitCount(1L)
                .build();
    }

    static GitHubWebhookMarketplacePurchaseChangedEvent webhookMarketplacePurchaseChangedEvent() {
        return GitHubWebhookMarketplacePurchaseChangedEventBuilder.builder()
                .effectiveDate("effective_date")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .marketplacePurchase(webhookMarketplacePurchase())
                .organization(webhookOrganizationSimple())
                .previousMarketplacePurchase(webhookMarketplacePurchaseChangedPreviousMarketplacePurchase())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchase
            webhookMarketplacePurchaseChangedPreviousMarketplacePurchase() {
        return GitHubWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseBuilder.builder()
                .account(webhookMarketplacePurchaseAccount())
                .billingCycle("billing_cycle")
                .freeTrialEndsOn("free_trial_ends_on")
                .nextBillingDate("next_billing_date")
                .onFreeTrial(true)
                .plan(webhookMarketplacePurchasePlan())
                .unitCount(1L)
                .build();
    }

    static GitHubWebhookMarketplacePurchasePendingChangeCancelledEvent
            webhookMarketplacePurchasePendingChangeCancelledEvent() {
        return GitHubWebhookMarketplacePurchasePendingChangeCancelledEventBuilder.builder()
                .effectiveDate("effective_date")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .marketplacePurchase(webhookMarketplacePurchaseCancelledPreviousMarketplacePurchase())
                .organization(webhookOrganizationSimple())
                .previousMarketplacePurchase(webhookMarketplacePurchaseCancelledPreviousMarketplacePurchase())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMarketplacePurchasePendingChangeEvent webhookMarketplacePurchasePendingChangeEvent() {
        return GitHubWebhookMarketplacePurchasePendingChangeEventBuilder.builder()
                .effectiveDate("effective_date")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .marketplacePurchase(webhookMarketplacePurchase())
                .organization(webhookOrganizationSimple())
                .previousMarketplacePurchase(webhookMarketplacePurchase())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMarketplacePurchasePlan webhookMarketplacePurchasePlan() {
        return GitHubWebhookMarketplacePurchasePlanBuilder.builder()
                .bullets(List.of("bullets"))
                .description("description")
                .hasFreeTrial(true)
                .id(1L)
                .monthlyPriceInCents(1L)
                .name("name")
                .priceModel(GitHubWebhookMarketplacePurchasePlanPriceModel.FREE)
                .unitName("unit_name")
                .yearlyPriceInCents(1L)
                .build();
    }

    static GitHubWebhookMarketplacePurchasePurchasedEvent webhookMarketplacePurchasePurchasedEvent() {
        return GitHubWebhookMarketplacePurchasePurchasedEventBuilder.builder()
                .effectiveDate("effective_date")
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .marketplacePurchase(webhookMarketplacePurchase())
                .organization(webhookOrganizationSimple())
                .previousMarketplacePurchase(webhookMarketplacePurchaseCancelledPreviousMarketplacePurchase())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
