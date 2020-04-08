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
public class ConversationPatchGQO {


    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private ThingRefGQO about;

    private UserRefGQO accountablePerson;

    private UserRefGQO creator;

    public ConversationPatchGQO() {
    }

    public ConversationPatchGQO( String identifier,  String name,  String alternateName,  String description,  ThingRefGQO about,  UserRefGQO accountablePerson,  UserRefGQO creator) {
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.about = about;
        this.accountablePerson = accountablePerson;
        this.creator = creator;
    }

}