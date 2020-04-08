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
public class AggregateOfferGQO {


    private Integer highPrice;

    private Integer lowPrice;

    private Integer offerCount;

    private Collection<OfferGQO> offers;

    public AggregateOfferGQO() {
    }

    public AggregateOfferGQO( Integer highPrice,  Integer lowPrice,  Integer offerCount,  Collection<OfferGQO> offers) {
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.offerCount = offerCount;
        this.offers = offers;
    }

}