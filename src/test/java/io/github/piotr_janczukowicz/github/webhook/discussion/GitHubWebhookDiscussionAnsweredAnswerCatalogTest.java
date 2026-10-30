package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionAnsweredAnswerCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionAnsweredAnswer.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-answered-answer.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-answered-answer-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionAnsweredAnswer();
    }
}
