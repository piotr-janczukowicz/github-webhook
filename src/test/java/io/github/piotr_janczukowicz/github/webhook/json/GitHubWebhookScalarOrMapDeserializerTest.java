package io.github.piotr_janczukowicz.github.webhook.json;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tools.jackson.databind.annotation.JsonDeserialize;

@UnitTest
class GitHubWebhookScalarOrMapDeserializerTest {

    record Holder(
            @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
            Map<String, Object> field) {}

    private static Holder read(final String field) {
        return GitHubWebhookJsonMappers.defaults().readValue("{\"field\":" + field + "}", Holder.class);
    }

    @Test
    void deserialize_shouldReadAnObjectAsAMap() {
        final Holder holder = read("{\"a\":1,\"b\":{\"c\":\"d\"}}");

        assertThat(holder.field()).isEqualTo(Map.of("a", 1, "b", Map.of("c", "d")));
    }

    @ParameterizedTest
    @CsvSource(
            delimiter = '|',
            value = {"\"text\"|text", "7|7", "true|true"})
    void deserialize_shouldReadAScalarAsTheValueOfValue(final String json, final String expected) {
        final Holder holder = read(json);

        assertThat(holder.field()).containsOnlyKeys("value");
        assertThat(String.valueOf(holder.field().get("value"))).isEqualTo(expected);
    }

    @Test
    void deserialize_shouldReadAnArrayAsTheValueOfValue() {
        final Holder holder = read("[1,\"a\"]");

        assertThat(holder.field()).isEqualTo(Map.of("value", List.of(1, "a")));
    }

    @Test
    void deserialize_shouldReadANestedObjectAsAMap() {
        final Holder holder = read("{\"a\":{\"b\":{\"c\":1}}}");

        assertThat(holder.field()).isEqualTo(Map.of("a", Map.of("b", Map.of("c", 1))));
    }

    @Test
    void deserialize_shouldLeaveANullFieldNull() {
        assertThat(read("null").field()).isNull();
    }
}
