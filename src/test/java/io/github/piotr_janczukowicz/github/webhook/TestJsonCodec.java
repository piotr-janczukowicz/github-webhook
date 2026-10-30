package io.github.piotr_janczukowicz.github.webhook;

import io.github.piotr_janczukowicz.github.webhook.json.GitHubWebhookJsonMappers;
import io.github.piotr_janczukowicz.json.JsonCodec;
import io.github.piotr_janczukowicz.json.JsonType;

final class TestJsonCodec implements JsonCodec {

    static final JsonCodec INSTANCE = new TestJsonCodec();

    private TestJsonCodec() {}

    @Override
    public <T> T decode(final byte[] json, final Class<T> type) {
        return GitHubWebhookJsonMappers.defaults().readValue(json, type);
    }

    @Override
    public <T> T decode(final byte[] json, final JsonType<T> type) {
        return GitHubWebhookJsonMappers.defaults()
                .readValue(json, GitHubWebhookJsonMappers.defaults().constructType(type.javaType()));
    }

    @Override
    public byte[] encode(final Object value) {
        return GitHubWebhookJsonMappers.defaults().writeValueAsBytes(value);
    }
}
