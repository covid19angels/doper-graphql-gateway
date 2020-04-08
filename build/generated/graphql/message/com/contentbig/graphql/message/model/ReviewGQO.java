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
public class ReviewGQO implements NodeGQO{


    private ThingGQO itemReviewed;

    private String reviewAspect;

    private String reviewBody;

    private Integer ratingValue;

    private PersonGQO author;
    @lombok.NonNull
    private String id;

    public ReviewGQO() {
    }

    public ReviewGQO( ThingGQO itemReviewed,  String reviewAspect,  String reviewBody,  Integer ratingValue,  PersonGQO author,  String id) {
        this.itemReviewed = itemReviewed;
        this.reviewAspect = reviewAspect;
        this.reviewBody = reviewBody;
        this.ratingValue = ratingValue;
        this.author = author;
        this.id = id;
    }

}