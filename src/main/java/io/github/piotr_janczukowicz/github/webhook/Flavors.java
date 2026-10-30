package io.github.piotr_janczukowicz.github.webhook;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The flavors whose webhook events carry the annotated type. A type without this annotation is sent by every flavor.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Flavors {

    /**
     * The flavors that send the type.
     *
     * @return one or more flavors
     */
    GitHubWebhookFlavor[] value();
}
