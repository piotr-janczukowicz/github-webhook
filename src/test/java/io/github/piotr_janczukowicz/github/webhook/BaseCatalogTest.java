package io.github.piotr_janczukowicz.github.webhook;

import io.github.piotr_janczukowicz.json.JsonCodec;
import io.github.piotr_janczukowicz.testsupport.UnitTest;
import io.github.piotr_janczukowicz.testsupport.catalog.AbstractCatalogTest;
import io.github.piotr_janczukowicz.testsupport.catalog.CatalogSchemaSource;

/**
 * Round-trip and docs-schema checks of one webhook type; the checks live in {@link AbstractCatalogTest}. A test can
 * override a check only to add {@code @Disabled} with the reason.
 */
@UnitTest
public abstract class BaseCatalogTest extends AbstractCatalogTest {

    @Override
    protected JsonCodec codec() {
        return TestJsonCodec.INSTANCE;
    }

    @Override
    protected CatalogSchemaSource schemaSource() {
        return WebhookCatalogSchemaSource.INSTANCE;
    }
}
