package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.lang.reflect.Constructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@UnitTest
class PrintableTextTest {

    @Test
    void of_shouldReplaceControlCharactersWithSpaces_whenTextHasLineBreaksAndTabs() {
        final String forged = "push\r\nWARN forged\tentry\u0000";

        final String printable = PrintableText.of(forged);

        assertThat(printable).isEqualTo("push  WARN forged entry ");
    }

    @Test
    void of_shouldKeepTheText_whenTextHasNoControlCharacters() {
        final String printable = PrintableText.of("pull_request_review");

        assertThat(printable).isEqualTo("pull_request_review");
    }

    @Test
    void ofNullable_shouldReturnNullOrThePrintableText_whenGivenNullOrText() {
        final String none = PrintableText.ofNullable(null);
        final String some = PrintableText.ofNullable("a\nb");

        assertSoftly(softly -> {
            softly.assertThat(none).isNull();
            softly.assertThat(some).isEqualTo("a b");
        });
    }

    @Test
    void limited_shouldKeepTheText_whenItFits() {
        final String limited = PrintableText.limited("abc", 3);

        assertThat(limited).isEqualTo("abc");
    }

    @Test
    void limited_shouldCutTheText_whenItIsLonger() {
        final String limited = PrintableText.limited("abcdef", 3);

        assertThat(limited).isEqualTo("abc");
    }

    @Test
    void limited_shouldNotSplitASurrogatePair_whenTheCutIsInsideOne() {
        final String limited = PrintableText.limited("ab😀cd", 3);

        assertThat(limited).isEqualTo("ab");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void limited_shouldThrow_whenMaxLengthIsLessThanOne(final int maxLength) {
        final Throwable thrown = catchThrowable(() -> PrintableText.limited("abc", maxLength));

        assertThat(thrown).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("maxLength");
    }

    @Test
    void constructor_shouldThrow_whenCalledByReflection() throws ReflectiveOperationException {
        final Constructor<PrintableText> constructor = PrintableText.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        final Throwable thrown = catchThrowable(constructor::newInstance);

        assertThat(thrown).hasCauseInstanceOf(UnsupportedOperationException.class);
    }
}
