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
public class OwnershipRefGQO {


    private String id;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private java.util.Date ownedFrom;

    private java.util.Date ownedThrough;

    private ThingRefGQO owned;

    public OwnershipRefGQO() {
    }

    public OwnershipRefGQO( String id,  String identifier,  String name,  String alternateName,  String description,  java.util.Date ownedFrom,  java.util.Date ownedThrough,  ThingRefGQO owned) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.ownedFrom = ownedFrom;
        this.ownedThrough = ownedThrough;
        this.owned = owned;
    }

}