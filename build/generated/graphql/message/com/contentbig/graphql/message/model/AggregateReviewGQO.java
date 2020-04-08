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
public class AggregateReviewGQO implements NodeGQO{


    private ThingGQO itemReviewed;

    private Integer ratingCount;

    private Integer reviewCount;

    private Integer bestRating;

    private Integer averageRating;

    private Integer worstRating;

    private String ratingExplanation;

    private Collection<ReviewGQO> reviews;
    @lombok.NonNull
    private String id;

    public AggregateReviewGQO() {
    }

    public AggregateReviewGQO( ThingGQO itemReviewed,  Integer ratingCount,  Integer reviewCount,  Integer bestRating,  Integer averageRating,  Integer worstRating,  String ratingExplanation,  Collection<ReviewGQO> reviews,  String id) {
        this.itemReviewed = itemReviewed;
        this.ratingCount = ratingCount;
        this.reviewCount = reviewCount;
        this.bestRating = bestRating;
        this.averageRating = averageRating;
        this.worstRating = worstRating;
        this.ratingExplanation = ratingExplanation;
        this.reviews = reviews;
        this.id = id;
    }

}