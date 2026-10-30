package io.github.piotr_janczukowicz.github.webhook;

import io.github.piotr_janczukowicz.json.JsonCodec;
import io.github.piotr_janczukowicz.testsupport.UnitTest;
import io.github.piotr_janczukowicz.testsupport.catalog.AbstractEnumCatalogTest;

/** Wire-value checks of one webhook enum; the checks live in {@link AbstractEnumCatalogTest}. */
@UnitTest
public abstract class BaseEnumCatalogTest extends AbstractEnumCatalogTest {

    @Override
    protected JsonCodec codec() {
        return TestJsonCodec.INSTANCE;
    }
}
