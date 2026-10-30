package io.github.piotr_janczukowicz.github.webhook;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import io.github.piotr_janczukowicz.testsupport.catalog.CatalogSchemaSource;
import io.github.piotr_janczukowicz.util.FileUtils;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.json.JsonMapper;

/**
 * Reads the schema of a {@code @CatalogSchema} pointer from the stored file next to the fixture;
 * {@code catalog-pointers.json} maps the pointer to that file. The stored schemas come from GitHub's OpenAPI
 * descriptions of the webhooks.
 */
final class WebhookCatalogSchemaSource implements CatalogSchemaSource {

    private static final String INDEX = "catalog-pointers.json";

    private static final TypeReference<Map<String, String>> FILES_TYPE = new TypeReference<>() {};

    static final CatalogSchemaSource INSTANCE = new WebhookCatalogSchemaSource();

    private final Map<String, String> files;

    private WebhookCatalogSchemaSource() {
        final byte[] index = requireNonNull(FileUtils.readBytes(WebhookCatalogSchemaSource.class, INDEX), "index");
        files = JsonMapper.builder().build().readValue(index, FILES_TYPE);
    }

    @Override
    public boolean covers(final String pointer) {
        return files.containsKey(pointer);
    }

    @Override
    public String schemaJson(final String pointer) {
        final String file = requireNonNull(files.get(pointer), "file of " + pointer);
        final byte[] bytes = requireNonNull(FileUtils.readBytes(WebhookCatalogSchemaSource.class, file), file);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
