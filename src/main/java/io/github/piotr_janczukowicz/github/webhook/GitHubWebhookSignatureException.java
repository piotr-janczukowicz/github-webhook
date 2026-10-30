package io.github.piotr_janczukowicz.github.webhook;

import java.io.Serial;

/** A webhook delivery whose signature is missing or wrong, so it does not come from GitHub. The body is not read. */
public final class GitHubWebhookSignatureException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    /** Creates the exception. */
    GitHubWebhookSignatureException() {
        super("The webhook signature is missing or does not match the body");
    }
}
