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
public class OfferGQO implements ThingGQO, ShoppingableGQO, NodeGQO{


    private Boolean isShoppingable;

    private String name;

    private String alternateName;

    private String description;

    private ProductGQO itemOffered;

    private PartyGQO offeredBy;

    private Integer price;
    @lombok.NonNull
    private String id;

    public OfferGQO() {
    }

    public OfferGQO( Boolean isShoppingable,  String name,  String alternateName,  String description,  ProductGQO itemOffered,  PartyGQO offeredBy,  Integer price,  String id) {
        this.isShoppingable = isShoppingable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.itemOffered = itemOffered;
        this.offeredBy = offeredBy;
        this.price = price;
        this.id = id;
    }

}