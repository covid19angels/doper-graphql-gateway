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
public class ProductModelGQO implements ThingGQO, ShoppingableGQO, NodeGQO{


    private ProductModelGQO isVariantOf;

    private ProductModelGQO predecessorOf;

    private ProductModelGQO successorOf;

    private Boolean isShoppingable;

    private String name;

    private String alternateName;

    private String description;

    private String productID;

    private Collection<ProductGQO> isRelatedTo;

    private Collection<ProductGQO> isSimilarTo;

    private OrganizationGQO manufacturer;

    private AggregateOfferGQO offers;

    private Collection<DemandGQO> demands;

    private AggregateReviewGQO aggregateReview;
    @lombok.NonNull
    private String id;

    public ProductModelGQO() {
    }

    public ProductModelGQO( ProductModelGQO isVariantOf,  ProductModelGQO predecessorOf,  ProductModelGQO successorOf,  Boolean isShoppingable,  String name,  String alternateName,  String description,  String productID,  Collection<ProductGQO> isRelatedTo,  Collection<ProductGQO> isSimilarTo,  OrganizationGQO manufacturer,  AggregateOfferGQO offers,  Collection<DemandGQO> demands,  AggregateReviewGQO aggregateReview,  String id) {
        this.isVariantOf = isVariantOf;
        this.predecessorOf = predecessorOf;
        this.successorOf = successorOf;
        this.isShoppingable = isShoppingable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.productID = productID;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.manufacturer = manufacturer;
        this.offers = offers;
        this.demands = demands;
        this.aggregateReview = aggregateReview;
        this.id = id;
    }

}