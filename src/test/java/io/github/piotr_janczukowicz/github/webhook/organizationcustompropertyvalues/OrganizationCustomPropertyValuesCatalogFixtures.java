package io.github.piotr_janczukowicz.github.webhook.organizationcustompropertyvalues;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookCustomPropertyValue;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.util.List;

final class OrganizationCustomPropertyValuesCatalogFixtures {

    private OrganizationCustomPropertyValuesCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookOrganizationCustomPropertyValuesUpdatedEvent
            webhookOrganizationCustomPropertyValuesUpdatedEvent() {
        return GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .newPropertyValues(List.of(webhookCustomPropertyValue()))
                .oldPropertyValues(List.of(webhookCustomPropertyValue()))
                .organization(webhookOrganizationSimple())
                .sender(webhookSimpleUser())
                .build();
    }
}
