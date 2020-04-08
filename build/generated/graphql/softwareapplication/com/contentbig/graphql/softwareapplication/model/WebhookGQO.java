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
public class WebhookGQO implements ThingGQO, NodeGQO{


    private String payloadUrl;

    private String contentType;

    private String secret;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private SoftwareApplicationGQO client;

    private Collection<ActionGQO> potentialActions;
    @lombok.NonNull
    private Collection<ACLNamespaceGQO> namespaces;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;
    @lombok.NonNull
    private String id;

    public WebhookGQO() {
    }

    public WebhookGQO( String payloadUrl,  String contentType,  String secret,  PersonGQO creator,  java.util.Date dateCreated,  SoftwareApplicationGQO client,  Collection<ActionGQO> potentialActions,  Collection<ACLNamespaceGQO> namespaces,  String identifier,  String name,  String alternateName,  String description,  String id) {
        this.payloadUrl = payloadUrl;
        this.contentType = contentType;
        this.secret = secret;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.client = client;
        this.potentialActions = potentialActions;
        this.namespaces = namespaces;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.id = id;
    }

}