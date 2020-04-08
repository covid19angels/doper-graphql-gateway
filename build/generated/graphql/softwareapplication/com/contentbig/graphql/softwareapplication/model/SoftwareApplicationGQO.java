package com.contentbig.graphql.softwareapplication.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;
import com.contentbig.graphql.softwareapplication.api.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class SoftwareApplicationGQO implements ThingGQO, NodeGQO{


    private String applicationSuite;

    private String downloadUrl;

    private String featureList;

    private String installUrl;

    private String iconUrl;

    private String releaseNotes;

    private String screenshot;

    private String softwareVersion;

    private Collection<ActionGQO> potentialActions;

    private SoftwareApplicationGQO isMiniAppOf;

    private Collection<SoftwareApplicationGQO> hasMiniApps;
    @lombok.NonNull
    private Collection<ACLNamespaceGQO> namespaces;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;
    @lombok.NonNull
    private String id;

    public SoftwareApplicationGQO() {
    }

    public SoftwareApplicationGQO( String applicationSuite,  String downloadUrl,  String featureList,  String installUrl,  String iconUrl,  String releaseNotes,  String screenshot,  String softwareVersion,  Collection<ActionGQO> potentialActions,  SoftwareApplicationGQO isMiniAppOf,  Collection<SoftwareApplicationGQO> hasMiniApps,  Collection<ACLNamespaceGQO> namespaces,  String identifier,  String name,  String alternateName,  String description,  String id) {
        this.applicationSuite = applicationSuite;
        this.downloadUrl = downloadUrl;
        this.featureList = featureList;
        this.installUrl = installUrl;
        this.iconUrl = iconUrl;
        this.releaseNotes = releaseNotes;
        this.screenshot = screenshot;
        this.softwareVersion = softwareVersion;
        this.potentialActions = potentialActions;
        this.isMiniAppOf = isMiniAppOf;
        this.hasMiniApps = hasMiniApps;
        this.namespaces = namespaces;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.id = id;
    }

}