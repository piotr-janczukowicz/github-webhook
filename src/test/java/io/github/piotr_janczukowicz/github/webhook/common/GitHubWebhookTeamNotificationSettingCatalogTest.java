package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookTeamNotificationSettingCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamNotificationSetting.class;
    }

    @Override
    protected String schema() {
        return "webhook-team-notification-setting-schema.json";
    }
}
