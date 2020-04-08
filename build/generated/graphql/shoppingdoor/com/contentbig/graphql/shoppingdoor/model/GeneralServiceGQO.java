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
public class GeneralServiceGQO implements ThingGQO, ShoppingableGQO, ServiceGQO, NodeGQO{


    private Boolean isShoppingable;

    private String name;

    private String alternateName;

    private String description;

    private PlaceGQO areaServed;

    private OpeningHoursSpecificationGQO hoursAvailable;

    private ProductGQO isRelatedTo;

    private ServiceGQO isSimilarTo;

    private Collection<ActionGQO> potentialActions;

    private Collection<ItemCategoryGQO> itemCategory;

    private AggregateOfferGQO offers;

    private Collection<DemandGQO> demands;

    private AggregateReviewGQO aggregateReview;
    @lombok.NonNull
    private String id;

    public GeneralServiceGQO() {
    }

    public GeneralServiceGQO( Boolean isShoppingable,  String name,  String alternateName,  String description,  PlaceGQO areaServed,  OpeningHoursSpecificationGQO hoursAvailable,  ProductGQO isRelatedTo,  ServiceGQO isSimilarTo,  Collection<ActionGQO> potentialActions,  Collection<ItemCategoryGQO> itemCategory,  AggregateOfferGQO offers,  Collection<DemandGQO> demands,  AggregateReviewGQO aggregateReview,  String id) {
        this.isShoppingable = isShoppingable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.areaServed = areaServed;
        this.hoursAvailable = hoursAvailable;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.potentialActions = potentialActions;
        this.itemCategory = itemCategory;
        this.offers = offers;
        this.demands = demands;
        this.aggregateReview = aggregateReview;
        this.id = id;
    }

}