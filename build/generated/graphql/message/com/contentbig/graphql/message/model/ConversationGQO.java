package com.contentbig.graphql.message.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.softwareapplication.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.message.api.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ConversationGQO implements NodeGQO{


    private ThingGQO about;

    private PersonGQO accountablePerson;

    private String headline;

    private String alternativeHeadline;

    private String description;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private DataCatalogGQO includedInDataCatalog;

    private Collection<MessageGQO> hasMessages;

    private Collection<WebhookGQO> webhook;

    private Collection<ActionGQO> potentialActions;
    @lombok.NonNull
    private String id;

    public ConversationGQO() {
    }

    public ConversationGQO( ThingGQO about,  PersonGQO accountablePerson,  String headline,  String alternativeHeadline,  String description,  PersonGQO creator,  java.util.Date dateCreated,  DataCatalogGQO includedInDataCatalog,  Collection<MessageGQO> hasMessages,  Collection<WebhookGQO> webhook,  Collection<ActionGQO> potentialActions,  String id) {
        this.about = about;
        this.accountablePerson = accountablePerson;
        this.headline = headline;
        this.alternativeHeadline = alternativeHeadline;
        this.description = description;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.includedInDataCatalog = includedInDataCatalog;
        this.hasMessages = hasMessages;
        this.webhook = webhook;
        this.potentialActions = potentialActions;
        this.id = id;
    }

}