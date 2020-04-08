package com.contentbig.graphql.organization.model;

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
import com.contentbig.graphql.organization.api.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class OwnershipGQO {


    private PartyGQO acquiredFrom;

    private java.util.Date ownedFrom;

    private java.util.Date ownedThrough;

    private OwnableGQO owned;

    private PartyGQO owner;

    public OwnershipGQO() {
    }

    public OwnershipGQO( PartyGQO acquiredFrom,  java.util.Date ownedFrom,  java.util.Date ownedThrough,  OwnableGQO owned,  PartyGQO owner) {
        this.acquiredFrom = acquiredFrom;
        this.ownedFrom = ownedFrom;
        this.ownedThrough = ownedThrough;
        this.owned = owned;
        this.owner = owner;
    }

}