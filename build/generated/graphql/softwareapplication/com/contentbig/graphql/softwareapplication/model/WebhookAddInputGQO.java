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
public class WebhookAddInputGQO {


    private String identifier;
    @lombok.NonNull
    private String name;

    private String alternateName;

    private String description;

    private String payloadUrl;

    private String contentType;

    private String secret;

    private UserRefGQO creator;

    private java.util.Date dateCreated;

    private SoftwareApplicationRefGQO client;

    public WebhookAddInputGQO() {
    }

    public WebhookAddInputGQO( String identifier,  String name,  String alternateName,  String description,  String payloadUrl,  String contentType,  String secret,  UserRefGQO creator,  java.util.Date dateCreated,  SoftwareApplicationRefGQO client) {
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.payloadUrl = payloadUrl;
        this.contentType = contentType;
        this.secret = secret;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.client = client;
    }

}