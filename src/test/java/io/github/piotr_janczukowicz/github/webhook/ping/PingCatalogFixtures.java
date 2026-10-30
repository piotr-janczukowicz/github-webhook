package io.github.piotr_janczukowicz.github.webhook.ping;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;
import java.util.List;

final class PingCatalogFixtures {

    private PingCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookHookResponse webhookHookResponse() {
        return GitHubWebhookHookResponseBuilder.builder()
                .code(1L)
                .message("message")
                .status("status")
                .build();
    }

    static GitHubWebhookPingEvent webhookPingEvent() {
        return GitHubWebhookPingEventBuilder.builder()
                .hook(webhookPingHook())
                .hookId(1L)
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .zen("zen")
                .build();
    }

    static GitHubWebhookPingHook webhookPingHook() {
        return GitHubWebhookPingHookBuilder.builder()
                .active(true)
                .appId(1L)
                .config(webhookPingHookConfig())
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .deliveriesUrl("https://api.github.com/deliveries_url")
                .events(List.of("events"))
                .id(1L)
                .lastResponse(webhookHookResponse())
                .name(GitHubWebhookPingHookName.WEB)
                .pingUrl("https://api.github.com/ping_url")
                .testUrl("https://api.github.com/test_url")
                .type("type")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookPingHookConfig webhookPingHookConfig() {
        return GitHubWebhookPingHookConfigBuilder.builder()
                .contentType("\"json\"")
                .insecureSsl("\"0\"")
                .secret("\"********\"")
                .url("https://example.com/webhook")
                .build();
    }
}
