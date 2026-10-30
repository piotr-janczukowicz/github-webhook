package io.github.piotr_janczukowicz.github.webhook.customproperty;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookCustomPropertyDeletedDefinition;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationCustomPropertySourceType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationCustomPropertyValueType;
import java.util.List;

final class CustomPropertyCatalogFixtures {

    private CustomPropertyCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCustomPropertyCreatedEvent webhookCustomPropertyCreatedEvent() {
        return GitHubWebhookCustomPropertyCreatedEventBuilder.builder()
                .definition(webhookOrganizationCustomProperty())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCustomPropertyDeletedEvent webhookCustomPropertyDeletedEvent() {
        return GitHubWebhookCustomPropertyDeletedEventBuilder.builder()
                .definition(webhookCustomPropertyDeletedDefinition())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCustomPropertyPromoteToEnterpriseEvent webhookCustomPropertyPromoteToEnterpriseEvent() {
        return GitHubWebhookCustomPropertyPromoteToEnterpriseEventBuilder.builder()
                .definition(webhookOrganizationCustomProperty())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookCustomPropertyUpdatedEvent webhookCustomPropertyUpdatedEvent() {
        return GitHubWebhookCustomPropertyUpdatedEventBuilder.builder()
                .definition(webhookOrganizationCustomProperty())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookOrganizationCustomProperty webhookOrganizationCustomProperty() {
        return GitHubWebhookOrganizationCustomPropertyBuilder.builder()
                .allowedValues(List.of("allowed_values"))
                .defaultValue(List.of("default_value"))
                .description("description")
                .propertyName("property_name")
                .requireExplicitValues(true)
                .required(true)
                .sourceType(GitHubWebhookOrganizationCustomPropertySourceType.ORGANIZATION)
                .url("https://api.github.com/url")
                .valueType(GitHubWebhookOrganizationCustomPropertyValueType.STRING)
                .valuesEditableBy(GitHubWebhookOrganizationCustomPropertyValuesEditableBy.ORG_ACTORS)
                .build();
    }
}
