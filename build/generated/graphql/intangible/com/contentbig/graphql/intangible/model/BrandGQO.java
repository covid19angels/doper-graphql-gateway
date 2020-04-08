package com.contentbig.graphql.intangible.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.intangible.api.*;
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
public class BrandGQO implements ThingGQO, NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private AggregateReviewGQO aggregateReview;

    private String logo;

    private String slogan;
    @lombok.NonNull
    private String id;

    public BrandGQO() {
    }

    public BrandGQO( String name,  String alternateName,  String description,  AggregateReviewGQO aggregateReview,  String logo,  String slogan,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.aggregateReview = aggregateReview;
        this.logo = logo;
        this.slogan = slogan;
        this.id = id;
    }

}