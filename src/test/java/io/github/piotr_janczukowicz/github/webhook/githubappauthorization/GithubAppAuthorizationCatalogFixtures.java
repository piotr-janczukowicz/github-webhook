package io.github.piotr_janczukowicz.github.webhook.githubappauthorization;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class GithubAppAuthorizationCatalogFixtures {

    private GithubAppAuthorizationCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookGithubAppAuthorizationRevokedEvent webhookGithubAppAuthorizationRevokedEvent() {
        return GitHubWebhookGithubAppAuthorizationRevokedEventBuilder.builder()
                .sender(webhookSimpleUser())
                .build();
    }
}
