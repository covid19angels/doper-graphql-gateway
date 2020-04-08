package com.contentbig.graphql.shoppingdoor.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.shoppingdoor.api.*;
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
public class DemandGQO implements ThingGQO, ShoppingableGQO, NodeGQO{


    private Boolean isShoppingable;

    private String name;

    private String alternateName;

    private String description;

    private PlaceGQO areaServed;

    private BusinessFunctionGQO businessFunction;

    private ServiceGQO itemOffered;

    private PartyGQO seeker;
    @lombok.NonNull
    private String id;

    public DemandGQO() {
    }

    public DemandGQO( Boolean isShoppingable,  String name,  String alternateName,  String description,  PlaceGQO areaServed,  BusinessFunctionGQO businessFunction,  ServiceGQO itemOffered,  PartyGQO seeker,  String id) {
        this.isShoppingable = isShoppingable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.areaServed = areaServed;
        this.businessFunction = businessFunction;
        this.itemOffered = itemOffered;
        this.seeker = seeker;
        this.id = id;
    }

}