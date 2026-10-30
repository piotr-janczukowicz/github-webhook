module io.github.piotr_janczukowicz.githubwebhook {
    requires common.json;
    requires common.util;
    requires transitive tools.jackson.databind;
    requires org.slf4j;
    requires org.jspecify;
    requires static io.soabase.recordbuilder.core;
    requires static java.compiler;
    requires static jdk.httpserver; // only the example endpoint in the tests uses it

    exports io.github.piotr_janczukowicz.github.webhook;

    opens io.github.piotr_janczukowicz.github.webhook.json to
            tools.jackson.databind;

    // <generated family packages>
    exports io.github.piotr_janczukowicz.github.webhook.branchprotectionconfiguration;

    opens io.github.piotr_janczukowicz.github.webhook.branchprotectionconfiguration to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

    opens io.github.piotr_janczukowicz.github.webhook.branchprotectionrule to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

    opens io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.cachesync;

    opens io.github.piotr_janczukowicz.github.webhook.cachesync to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.checkrun;

    opens io.github.piotr_janczukowicz.github.webhook.checkrun to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.checksuite;

    opens io.github.piotr_janczukowicz.github.webhook.checksuite to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.codescanningalert;

    opens io.github.piotr_janczukowicz.github.webhook.codescanningalert to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.commitcomment;

    opens io.github.piotr_janczukowicz.github.webhook.commitcomment to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.common;

    opens io.github.piotr_janczukowicz.github.webhook.common to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.create;

    opens io.github.piotr_janczukowicz.github.webhook.create to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.customproperty;

    opens io.github.piotr_janczukowicz.github.webhook.customproperty to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.custompropertyvalues;

    opens io.github.piotr_janczukowicz.github.webhook.custompropertyvalues to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.delete;

    opens io.github.piotr_janczukowicz.github.webhook.delete to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.dependabotalert;

    opens io.github.piotr_janczukowicz.github.webhook.dependabotalert to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.deploykey;

    opens io.github.piotr_janczukowicz.github.webhook.deploykey to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.deployment;

    opens io.github.piotr_janczukowicz.github.webhook.deployment to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule;

    opens io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.deploymentreview;

    opens io.github.piotr_janczukowicz.github.webhook.deploymentreview to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

    opens io.github.piotr_janczukowicz.github.webhook.deploymentstatus to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.discussion;

    opens io.github.piotr_janczukowicz.github.webhook.discussion to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.discussioncomment;

    opens io.github.piotr_janczukowicz.github.webhook.discussioncomment to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning;

    opens io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot;

    opens io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

    opens io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

    opens io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.enterprise;

    opens io.github.piotr_janczukowicz.github.webhook.enterprise to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

    opens io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.fork;

    opens io.github.piotr_janczukowicz.github.webhook.fork to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.githubappauthorization;

    opens io.github.piotr_janczukowicz.github.webhook.githubappauthorization to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.gollum;

    opens io.github.piotr_janczukowicz.github.webhook.gollum to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.installation;

    opens io.github.piotr_janczukowicz.github.webhook.installation to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.installationrepositories;

    opens io.github.piotr_janczukowicz.github.webhook.installationrepositories to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.installationtarget;

    opens io.github.piotr_janczukowicz.github.webhook.installationtarget to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.issuecomment;

    opens io.github.piotr_janczukowicz.github.webhook.issuecomment to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.issuedependencies;

    opens io.github.piotr_janczukowicz.github.webhook.issuedependencies to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.issuerelatesto;

    opens io.github.piotr_janczukowicz.github.webhook.issuerelatesto to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.issues;

    opens io.github.piotr_janczukowicz.github.webhook.issues to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.label;

    opens io.github.piotr_janczukowicz.github.webhook.label to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.marketplacepurchase;

    opens io.github.piotr_janczukowicz.github.webhook.marketplacepurchase to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.member;

    opens io.github.piotr_janczukowicz.github.webhook.member to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.membership;

    opens io.github.piotr_janczukowicz.github.webhook.membership to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.mergegroup;

    opens io.github.piotr_janczukowicz.github.webhook.mergegroup to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.meta;

    opens io.github.piotr_janczukowicz.github.webhook.meta to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.milestone;

    opens io.github.piotr_janczukowicz.github.webhook.milestone to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.organization;

    opens io.github.piotr_janczukowicz.github.webhook.organization to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

    opens io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.organizationcustompropertyvalues;

    opens io.github.piotr_janczukowicz.github.webhook.organizationcustompropertyvalues to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.orgblock;

    opens io.github.piotr_janczukowicz.github.webhook.orgblock to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.packageevents;

    opens io.github.piotr_janczukowicz.github.webhook.packageevents to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.pagebuild;

    opens io.github.piotr_janczukowicz.github.webhook.pagebuild to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

    opens io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.ping;

    opens io.github.piotr_janczukowicz.github.webhook.ping to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.project;

    opens io.github.piotr_janczukowicz.github.webhook.project to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.projectcard;

    opens io.github.piotr_janczukowicz.github.webhook.projectcard to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.projectcolumn;

    opens io.github.piotr_janczukowicz.github.webhook.projectcolumn to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.projectsv2;

    opens io.github.piotr_janczukowicz.github.webhook.projectsv2 to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.projectsv2item;

    opens io.github.piotr_janczukowicz.github.webhook.projectsv2item to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

    opens io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.publicevents;

    opens io.github.piotr_janczukowicz.github.webhook.publicevents to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.pullrequest;

    opens io.github.piotr_janczukowicz.github.webhook.pullrequest to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

    opens io.github.piotr_janczukowicz.github.webhook.pullrequestreview to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

    opens io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

    opens io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.push;

    opens io.github.piotr_janczukowicz.github.webhook.push to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.registrypackage;

    opens io.github.piotr_janczukowicz.github.webhook.registrypackage to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.release;

    opens io.github.piotr_janczukowicz.github.webhook.release to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.repository;

    opens io.github.piotr_janczukowicz.github.webhook.repository to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

    opens io.github.piotr_janczukowicz.github.webhook.repositoryadvisory to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.repositorydispatch;

    opens io.github.piotr_janczukowicz.github.webhook.repositorydispatch to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.repositoryimport;

    opens io.github.piotr_janczukowicz.github.webhook.repositoryimport to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

    opens io.github.piotr_janczukowicz.github.webhook.repositoryruleset to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.repositoryvulnerabilityalert;

    opens io.github.piotr_janczukowicz.github.webhook.repositoryvulnerabilityalert to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

    opens io.github.piotr_janczukowicz.github.webhook.secretscanningalert to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

    opens io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

    opens io.github.piotr_janczukowicz.github.webhook.secretscanningscan to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.securityadvisory;

    opens io.github.piotr_janczukowicz.github.webhook.securityadvisory to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

    opens io.github.piotr_janczukowicz.github.webhook.securityandanalysis to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.sponsorship;

    opens io.github.piotr_janczukowicz.github.webhook.sponsorship to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.star;

    opens io.github.piotr_janczukowicz.github.webhook.star to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.status;

    opens io.github.piotr_janczukowicz.github.webhook.status to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.subissues;

    opens io.github.piotr_janczukowicz.github.webhook.subissues to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.team;

    opens io.github.piotr_janczukowicz.github.webhook.team to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.teamadd;

    opens io.github.piotr_janczukowicz.github.webhook.teamadd to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.user;

    opens io.github.piotr_janczukowicz.github.webhook.user to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.watch;

    opens io.github.piotr_janczukowicz.github.webhook.watch to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.workflowdispatch;

    opens io.github.piotr_janczukowicz.github.webhook.workflowdispatch to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.workflowjob;

    opens io.github.piotr_janczukowicz.github.webhook.workflowjob to
            tools.jackson.databind,
            common.util;

    exports io.github.piotr_janczukowicz.github.webhook.workflowrun;

    opens io.github.piotr_janczukowicz.github.webhook.workflowrun to
            tools.jackson.databind,
            common.util;

// </generated family packages>
}
