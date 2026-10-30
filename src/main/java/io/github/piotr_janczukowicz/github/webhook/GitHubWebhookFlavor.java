package io.github.piotr_janczukowicz.github.webhook;

/** A GitHub product that sends webhook events. */
public enum GitHubWebhookFlavor {
    /** GitHub.com. */
    CLOUD,
    /** GitHub Enterprise Cloud, including GitHub Enterprise Cloud with data residency. */
    GHEC,
    /** GitHub Enterprise Server. */
    GHES
}
