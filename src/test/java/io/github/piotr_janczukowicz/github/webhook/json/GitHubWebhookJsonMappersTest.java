package io.github.piotr_janczukowicz.github.webhook.json;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.github.webhook.registrypackage.GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata;
import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.lang.reflect.Constructor;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.json.JsonMapper;

@UnitTest
class GitHubWebhookJsonMappersTest {

    private final JsonMapper mapper = GitHubWebhookJsonMappers.defaults();

    record Sample(String fullName, Instant createdAt, List<String> labels) {}

    record Committed(OffsetDateTime timestamp) {}

    record Counter(long count, boolean flag) {}

    @Test
    void defaults_shouldReadSnakeCaseAndIgnoreUnknownProperties_whenJsonHasExtraFields() {
        final String json = """
                {"full_name":"octo/hello","created_at":"2026-01-01T00:00:00Z","labels":["a"],"added_later":{"x":1}}
                """;

        final Sample sample = mapper.readValue(json, Sample.class);

        assertThat(sample.fullName()).isEqualTo("octo/hello");
    }

    @Test
    void defaults_shouldReadAScalarAsTheValueOfAMap_whenTheModuleListsTheComponent() {
        final String json = "{\"id\":7,\"name\":\"n\",\"value\":{\"a\":1}}";

        final GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata metadata =
                mapper.readValue(
                        json, GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata.class);

        assertSoftly(softly -> {
            softly.assertThat(metadata.id()).isEqualTo(Map.of("value", 7));
            softly.assertThat(metadata.value()).isEqualTo(Map.of("a", 1));
        });
    }

    @Test
    void defaults_shouldReadInstantFromIsoStringAndFromEpochSeconds() {
        final Sample iso = mapper.readValue("{\"created_at\":\"2026-01-01T00:00:00Z\"}", Sample.class);
        final Sample epoch = mapper.readValue("{\"created_at\":1767225600}", Sample.class);

        assertSoftly(softly -> {
            softly.assertThat(iso.createdAt()).isEqualTo(Instant.parse("2026-01-01T00:00:00Z"));
            softly.assertThat(epoch.createdAt()).isEqualTo(Instant.parse("2026-01-01T00:00:00Z"));
        });
    }

    @Test
    void defaults_shouldWriteInstantAsIsoStringAndNamesAsSnakeCase() {
        final Sample sample = new Sample("octo/hello", Instant.parse("2026-01-01T00:00:00Z"), List.of());

        final String json = mapper.writeValueAsString(sample);

        assertThat(json).contains("\"full_name\":\"octo/hello\"").contains("\"created_at\":\"2026-01-01T00:00:00Z\"");
    }

    @Test
    void defaults_shouldReadNumbersAndBooleansIntoStringProperties() {
        final Sample number = mapper.readValue("{\"full_name\":1}", Sample.class);
        final Sample decimal = mapper.readValue("{\"full_name\":0.5}", Sample.class);
        final Sample flag = mapper.readValue("{\"full_name\":true}", Sample.class);

        assertSoftly(softly -> {
            softly.assertThat(number.fullName()).isEqualTo("1");
            softly.assertThat(decimal.fullName()).isEqualTo("0.5");
            softly.assertThat(flag.fullName()).isEqualTo("true");
        });
    }

    @Test
    void defaults_shouldKeepTheOffsetOfAnOffsetDateTime_whenReadAndWritten() {
        final Committed committed = mapper.readValue("{\"timestamp\":\"2019-05-15T15:20:33-04:00\"}", Committed.class);

        final String json = mapper.writeValueAsString(committed);

        assertSoftly(softly -> {
            softly.assertThat(committed.timestamp().getOffset().getTotalSeconds())
                    .isEqualTo(-4 * 3600);
            softly.assertThat(json).contains("2019-05-15T15:20:33-04:00");
        });
    }

    @Test
    void defaults_shouldFail_whenPrimitivePropertyIsMissing() {
        final Throwable thrown = catchThrowable(() -> mapper.readValue("{\"count\":1}", Counter.class));

        assertThat(thrown).isNotNull().hasMessageContaining("Missing required creator property 'flag'");
    }

    @Test
    void defaults_shouldFail_whenIntegerPropertyIsADecimalOrText() {
        final Throwable decimal =
                catchThrowable(() -> mapper.readValue("{\"count\":1.5,\"flag\":true}", Counter.class));
        final Throwable text =
                catchThrowable(() -> mapper.readValue("{\"count\":\"12\",\"flag\":true}", Counter.class));

        assertSoftly(softly -> {
            softly.assertThat(decimal).isNotNull();
            softly.assertThat(text).isNotNull();
        });
    }

    @Test
    void defaults_shouldReturnTheSameMapperEveryTime() {
        final JsonMapper first = GitHubWebhookJsonMappers.defaults();
        final JsonMapper second = GitHubWebhookJsonMappers.defaults();

        assertThat(first).isSameAs(second);
    }

    @Test
    void defaults_shouldReadAMissingBoxedPropertyAsNull() {
        final Sample sample = mapper.readValue("{\"labels\":[\"a\"]}", Sample.class);

        assertThat(sample.createdAt()).isNull();
    }

    @Test
    void defaults_shouldReadASingleValueAsACollectionOfOne_whenPropertyIsAList() {
        final Sample sample = mapper.readValue("{\"labels\":\"a\"}", Sample.class);

        assertThat(sample.labels()).containsExactly("a");
    }

    @Test
    void defaults_shouldReadLargeIntegers_whenPropertyIsLong() {
        final Counter counter = mapper.readValue("{\"count\":3000000000,\"flag\":false}", Counter.class);

        assertThat(counter.count()).isEqualTo(3_000_000_000L);
    }

    @Test
    void defaults_shouldDecodeCollectionsAsUnmodifiable() {
        final Sample sample = mapper.readValue("{\"labels\":[\"a\"]}", Sample.class);

        final Throwable thrown = catchThrowable(() -> sample.labels().add("b"));

        assertThat(thrown).isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void defaults_shouldRejectDuplicateKeys() {
        final Throwable thrown = catchThrowable(() -> mapper.readValue("{\"labels\":[],\"labels\":[]}", Sample.class));

        assertThat(thrown).isNotNull().hasMessageContaining("Duplicate");
    }

    @Test
    void constructor_shouldThrow_whenCalledByReflection() throws ReflectiveOperationException {
        final Constructor<GitHubWebhookJsonMappers> constructor =
                GitHubWebhookJsonMappers.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        final Throwable thrown = catchThrowable(constructor::newInstance);

        assertThat(thrown).hasCauseInstanceOf(UnsupportedOperationException.class);
    }
}
