package io.github.piotr_janczukowicz.github.webhook.json;

import io.github.piotr_janczukowicz.json.jackson.module.immutable.ImmutableCollectionsModule;
import java.io.Serial;
import tools.jackson.core.StreamReadFeature;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.cfg.CoercionAction;
import tools.jackson.databind.cfg.CoercionInputShape;
import tools.jackson.databind.cfg.DateTimeFeature;
import tools.jackson.databind.cfg.MapperConfig;
import tools.jackson.databind.introspect.AnnotatedMember;
import tools.jackson.databind.introspect.AnnotatedParameter;
import tools.jackson.databind.introspect.JacksonAnnotationIntrospector;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.type.LogicalType;

/**
 * The mapper that reads GitHub's webhook JSON: snake_case names, unknown properties ignored (GitHub adds fields without
 * notice), duplicate keys rejected, collections decoded as unmodifiable, and {@code Instant} read from an ISO-8601
 * string or from epoch seconds and written as an ISO-8601 string; an {@code OffsetDateTime} keeps its offset. A number
 * or a boolean is read into a {@code String} property (a scalar union such as {@code string|number} is modelled as
 * text), and a single value is read into a collection property as a collection of one, so both hide a change of shape
 * in GitHub's JSON. A decimal or a text is never read into an integer property, and a primitive record component that
 * the body leaves out fails instead of becoming {@code 0} or {@code false}.
 */
public final class GitHubWebhookJsonMappers {

    private static final JsonMapper DEFAULTS = JsonMapper.builder()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(DeserializationFeature.ACCEPT_FLOAT_AS_INT)
            .annotationIntrospector(new RequiredPrimitivesIntrospector())
            .enable(StreamReadFeature.STRICT_DUPLICATE_DETECTION)
            .disable(DateTimeFeature.WRITE_DATES_AS_TIMESTAMPS)
            .disable(DateTimeFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE)
            .propertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
            .withCoercionConfig(LogicalType.Textual, cfg -> {
                cfg.setCoercion(CoercionInputShape.Integer, CoercionAction.TryConvert);
                cfg.setCoercion(CoercionInputShape.Float, CoercionAction.TryConvert);
                cfg.setCoercion(CoercionInputShape.Boolean, CoercionAction.TryConvert);
            })
            .withCoercionConfig(LogicalType.Integer, cfg -> {
                cfg.setCoercion(CoercionInputShape.String, CoercionAction.Fail);
                cfg.setCoercion(CoercionInputShape.Float, CoercionAction.Fail);
            })
            .addModule(new ImmutableCollectionsModule())
            .addModule(new GitHubWebhookModule())
            .build();

    private GitHubWebhookJsonMappers() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * The shared mapper; it is thread-safe and not to be reconfigured.
     *
     * @return the mapper for webhook payloads
     */
    public static JsonMapper defaults() {
        return DEFAULTS;
    }

    /** The generated records use a primitive for a property the spec requires and cannot be null. */
    private static final class RequiredPrimitivesIntrospector extends JacksonAnnotationIntrospector {

        @Serial
        private static final long serialVersionUID = 1L;

        @Override
        public Boolean hasRequiredMarker(final MapperConfig<?> config, final AnnotatedMember member) {
            return member instanceof AnnotatedParameter && member.getRawType().isPrimitive()
                    ? Boolean.TRUE
                    : super.hasRequiredMarker(config, member);
        }
    }
}
