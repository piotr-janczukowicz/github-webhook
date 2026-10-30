package io.github.piotr_janczukowicz.github.webhook;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requirePositive;

import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;

/**
 * Text from a delivery that is safe to put in a log line or an exception message. The header of a delivery is not
 * authenticated when the decoder reads it, so a line break in it must not start a forged log entry.
 */
final class PrintableText {

    private static final Pattern CONTROL = Pattern.compile("\\p{Cntrl}");

    private PrintableText() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Replaces every control character, such as a line break, with a space.
     *
     * @param text the text to print
     * @return {@code text} without control characters
     */
    static String of(final String text) {
        return CONTROL.matcher(text).replaceAll(" ");
    }

    /**
     * Replaces every control character, such as a line break, with a space.
     *
     * @param text the text to print, or {@code null}
     * @return {@code text} without control characters, or {@code null} when there was none
     */
    static @Nullable String ofNullable(final @Nullable String text) {
        return text == null ? null : of(text);
    }

    /**
     * Cuts the text to at most {@code maxLength} characters, never inside a surrogate pair.
     *
     * @param text the text to cut
     * @param maxLength the most characters to keep, positive
     * @return {@code text}, or its first characters when it is longer
     * @throws IllegalArgumentException if {@code maxLength} is not positive
     */
    static String limited(final String text, final int maxLength) {
        requirePositive(maxLength, "maxLength");
        if (text.length() <= maxLength) {
            return text;
        }
        final int end = Character.isHighSurrogate(text.charAt(maxLength - 1)) ? maxLength - 1 : maxLength;
        return text.substring(0, end);
    }
}
