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
public class AddConversationInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String actionId;

    private String identifier;
    @lombok.NonNull
    private String name;

    private String alternateName;

    private String description;

    private ThingRefGQO about;

    private UserRefGQO accountablePerson;

    private UserRefGQO creator;

    private java.util.Date dateCreated;

    public AddConversationInputGQO() {
    }

    public AddConversationInputGQO( String clientMutationId,  String actionId,  String identifier,  String name,  String alternateName,  String description,  ThingRefGQO about,  UserRefGQO accountablePerson,  UserRefGQO creator,  java.util.Date dateCreated) {
        this.clientMutationId = clientMutationId;
        this.actionId = actionId;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.about = about;
        this.accountablePerson = accountablePerson;
        this.creator = creator;
        this.dateCreated = dateCreated;
    }

}