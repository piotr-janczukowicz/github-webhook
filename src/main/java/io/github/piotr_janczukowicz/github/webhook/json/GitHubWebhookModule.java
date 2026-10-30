package io.github.piotr_janczukowicz.github.webhook.json;

import java.io.Serial;
import tools.jackson.databind.module.SimpleModule;

/** Tells the mapper what the records cannot say themselves, so the records carry no Jackson classes of ours. */
final class GitHubWebhookModule extends SimpleModule {

    @Serial
    private static final long serialVersionUID = 1L;

    GitHubWebhookModule() {
        super("github-webhook");
        GitHubWebhookMixins.addTo(this);
    }
}
