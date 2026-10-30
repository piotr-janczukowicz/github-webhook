package io.github.piotr_janczukowicz.github.webhook.watch;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWatchStartedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWatchStartedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-watch-started-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-watch-started-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WatchCatalogFixtures.webhookWatchStartedEvent();
    }
}
