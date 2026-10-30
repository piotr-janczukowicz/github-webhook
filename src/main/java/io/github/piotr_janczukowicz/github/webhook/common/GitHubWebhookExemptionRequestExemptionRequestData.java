package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/** The exemption request exemption request data: one of its members, told apart by {@code type}. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = GitHubWebhookPushRulesetBypassExemptionRequestData.class, name = "push_ruleset_bypass"),
    @JsonSubTypes.Type(
            value = GitHubWebhookSecretScanningPushProtectionExemptionRequestData.class,
            name = "secret_scanning"),
    @JsonSubTypes.Type(
            value = GitHubWebhookSecretScanningAlertDismissalRequestData.class,
            name = "secret_scanning_closure"),
    @JsonSubTypes.Type(
            value = GitHubWebhookCodeScanningAlertDismissalRequestData.class,
            name = "code_scanning_alert_dismissal"),
    @JsonSubTypes.Type(
            value = GitHubWebhookDependabotAlertDismissalRequestData.class,
            name = "dependabot_alert_dismissal"),
    @JsonSubTypes.Type(
            value = GitHubWebhookLicenseComplianceAlertClosureRequestData.class,
            name = "license_compliance_dismissal")
})
public sealed interface GitHubWebhookExemptionRequestExemptionRequestData
        permits GitHubWebhookPushRulesetBypassExemptionRequestData,
                GitHubWebhookSecretScanningPushProtectionExemptionRequestData,
                GitHubWebhookSecretScanningAlertDismissalRequestData,
                GitHubWebhookCodeScanningAlertDismissalRequestData,
                GitHubWebhookDependabotAlertDismissalRequestData,
                GitHubWebhookLicenseComplianceAlertClosureRequestData {}
