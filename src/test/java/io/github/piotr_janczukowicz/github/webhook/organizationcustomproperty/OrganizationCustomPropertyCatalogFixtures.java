package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookCustomPropertyDeletedDefinition;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationCustomPropertySourceType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationCustomPropertyValueType;
import java.util.List;

final class OrganizationCustomPropertyCatalogFixtures {

    private OrganizationCustomPropertyCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCustomPropertyForOrganization webhookCustomPropertyForOrganization() {
        return GitHubWebhookCustomPropertyForOrganizationBuilder.builder()
                .allowedValues(List.of("allowed_values"))
                .defaultValue(List.of("default_value"))
                .description("description")
                .propertyName("property_name")
                .required(true)
                .sourceType(GitHubWebhookOrganizationCustomPropertySourceType.ORGANIZATION)
                .url("https://api.github.com/url")
                .valueType(GitHubWebhookOrganizationCustomPropertyValueType.STRING)
                .valuesEditableBy(GitHubWebhookCustomPropertyForOrganizationValuesEditableBy.ENTERPRISE_ACTORS)
                .build();
    }

    static GitHubWebhookOrganizationCustomPropertyCreatedEvent webhookOrganizationCustomPropertyCreatedEvent() {
        return GitHubWebhookOrganizationCustomPropertyCreatedEventBuilder.builder()
                .definition(webhookCustomPropertyForOrganization())
                .enterprise(webhookEnterprise())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookOrganizationCustomPropertyDeletedEvent webhookOrganizationCustomPropertyDeletedEvent() {
        return GitHubWebhookOrganizationCustomPropertyDeletedEventBuilder.builder()
                .definition(webhookCustomPropertyDeletedDefinition())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookOrganizationCustomPropertyUpdatedEvent webhookOrganizationCustomPropertyUpdatedEvent() {
        return GitHubWebhookOrganizationCustomPropertyUpdatedEventBuilder.builder()
                .definition(webhookCustomPropertyForOrganization())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .sender(webhookSimpleUser())
                .build();
    }
}
