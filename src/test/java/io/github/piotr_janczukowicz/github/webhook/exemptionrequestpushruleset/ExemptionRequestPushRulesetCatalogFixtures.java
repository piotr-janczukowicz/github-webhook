package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionResponse;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class ExemptionRequestPushRulesetCatalogFixtures {

    private ExemptionRequestPushRulesetCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookExemptionRequestPushRulesetCancelledEvent webhookExemptionRequestPushRulesetCancelledEvent() {
        return GitHubWebhookExemptionRequestPushRulesetCancelledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookExemptionRequestPushRulesetCompletedEvent webhookExemptionRequestPushRulesetCompletedEvent() {
        return GitHubWebhookExemptionRequestPushRulesetCompletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookExemptionRequestPushRulesetCreatedEvent webhookExemptionRequestPushRulesetCreatedEvent() {
        return GitHubWebhookExemptionRequestPushRulesetCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookExemptionRequestPushRulesetResponseDismissedEvent
            webhookExemptionRequestPushRulesetResponseDismissedEvent() {
        return GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .exemptionResponse(webhookExemptionResponse())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEvent
            webhookExemptionRequestPushRulesetResponseSubmittedEvent() {
        return GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .exemptionResponse(webhookExemptionResponse())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
