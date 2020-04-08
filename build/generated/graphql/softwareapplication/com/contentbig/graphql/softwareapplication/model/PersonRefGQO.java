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
public class PersonRefGQO {


    private String id;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private Collection<OwnershipRefGQO> owns;

    private String personalID;

    private String familyName;

    private String givenName;

    private UserRefGQO hasUser;

    public PersonRefGQO() {
    }

    public PersonRefGQO( String id,  String identifier,  String name,  String alternateName,  String description,  Collection<OwnershipRefGQO> owns,  String personalID,  String familyName,  String givenName,  UserRefGQO hasUser) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.owns = owns;
        this.personalID = personalID;
        this.familyName = familyName;
        this.givenName = givenName;
        this.hasUser = hasUser;
    }

}