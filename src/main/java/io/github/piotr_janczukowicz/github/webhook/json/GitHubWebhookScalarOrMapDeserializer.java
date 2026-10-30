package io.github.piotr_janczukowicz.github.webhook.json;

import java.util.Map;
import tools.jackson.core.JsonParser;
import tools.jackson.core.JsonToken;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JavaType;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.type.TypeFactory;

/**
 * Reads a JSON object as a map and anything else (a string, number, boolean or an array) as a map with that value under
 * {@code value}, for the webhook fields that GitHub sends as either.
 */
@SuppressWarnings("PMD.AtLeastOneConstructor") // Jackson creates it with the implicit constructor
final class GitHubWebhookScalarOrMapDeserializer extends ValueDeserializer<Map<String, Object>> {

    /** Key that holds a scalar. */
    static final String VALUE_KEY = "value";

    private static final JavaType MAP_TYPE =
            TypeFactory.createDefaultInstance().constructMapType(Map.class, String.class, Object.class);

    @Override
    public Map<String, Object> deserialize(final JsonParser parser, final DeserializationContext context) {
        if (parser.currentToken() == JsonToken.START_OBJECT) {
            return context.readValue(parser, MAP_TYPE);
        }
        return Map.of(VALUE_KEY, context.readValue(parser, Object.class));
    }
}
