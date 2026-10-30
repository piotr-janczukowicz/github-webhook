package io.github.piotr_janczukowicz.github.webhook.json;

import io.github.piotr_janczukowicz.github.webhook.packageevents.GitHubWebhookPackagePublishedPackagePackageVersion;
import io.github.piotr_janczukowicz.github.webhook.packageevents.GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadata;
import io.github.piotr_janczukowicz.github.webhook.projectsv2item.GitHubWebhookProjectsV2ItemEditedChangesFieldValueValue;
import io.github.piotr_janczukowicz.github.webhook.registrypackage.GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersion;
import io.github.piotr_janczukowicz.github.webhook.registrypackage.GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata;
import io.github.piotr_janczukowicz.github.webhook.registrypackage.GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata;
import java.util.Map;
import tools.jackson.databind.annotation.JsonDeserialize;
import tools.jackson.databind.module.SimpleModule;

/** The components that read a JSON object or a scalar, by record; generated. */
final class GitHubWebhookMixins {

    private GitHubWebhookMixins() {}

    static void addTo(final SimpleModule module) {
        module.setMixInAnnotation(
                io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeployment.class,
                CommonGitHubWebhookDeploymentMixin.class);
        module.setMixInAnnotation(
                io.github.piotr_janczukowicz.github.webhook.deployment.GitHubWebhookDeployment.class,
                DeploymentGitHubWebhookDeploymentMixin.class);
        module.setMixInAnnotation(
                io.github.piotr_janczukowicz.github.webhook.deploymentstatus.GitHubWebhookDeployment.class,
                DeploymentstatusGitHubWebhookDeploymentMixin.class);
        module.setMixInAnnotation(
                GitHubWebhookPackagePublishedPackagePackageVersion.class,
                GitHubWebhookPackagePublishedPackagePackageVersionMixin.class);
        module.setMixInAnnotation(
                GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadata.class,
                GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadataMixin.class);
        module.setMixInAnnotation(
                GitHubWebhookProjectsV2ItemEditedChangesFieldValueValue.class,
                GitHubWebhookProjectsV2ItemEditedChangesFieldValueValueMixin.class);
        module.setMixInAnnotation(
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersion.class,
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionMixin.class);
        module.setMixInAnnotation(
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.class,
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadataMixin.class);
        module.setMixInAnnotation(
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata.class,
                GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataMixin.class);
    }

    private interface CommonGitHubWebhookDeploymentMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> payload();
    }

    private interface DeploymentGitHubWebhookDeploymentMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> payload();
    }

    private interface DeploymentstatusGitHubWebhookDeploymentMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> payload();
    }

    private interface GitHubWebhookPackagePublishedPackagePackageVersionMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> body();
    }

    private interface GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadataMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> value();
    }

    private interface GitHubWebhookProjectsV2ItemEditedChangesFieldValueValueMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> from();

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> to();
    }

    private interface GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> body();
    }

    private interface GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadataMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> author();

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> bugs();

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> directories();

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> dist();

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> repository();
    }

    private interface GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataMixin {

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> id();

        @JsonDeserialize(using = GitHubWebhookScalarOrMapDeserializer.class)
        Map<String, Object> value();
    }
}
