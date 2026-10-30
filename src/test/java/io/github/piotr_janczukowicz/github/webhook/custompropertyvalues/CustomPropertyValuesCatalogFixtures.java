package io.github.piotr_janczukowicz.github.webhook.custompropertyvalues;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookCustomPropertyValue;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.util.List;

final class CustomPropertyValuesCatalogFixtures {

    private CustomPropertyValuesCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookCustomPropertyValuesUpdatedEvent webhookCustomPropertyValuesUpdatedEvent() {
        return GitHubWebhookCustomPropertyValuesUpdatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .newPropertyValues(List.of(webhookCustomPropertyValue()))
                .oldPropertyValues(List.of(webhookCustomPropertyValue()))
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
