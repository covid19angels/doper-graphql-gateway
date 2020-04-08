package com.contentbig.graphql.shoppingman.model;

import com.contentbig.graphql.shoppingman.api.*;
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

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ProductOfferOfflinePayloadGQO {


    private OfferGQO productOffer;

    private ActionGQO action;
    @lombok.NonNull
    private Collection<ProductOfferOfflineErrorGQO> productOfferOfflineErrors;

    public ProductOfferOfflinePayloadGQO() {
    }

    public ProductOfferOfflinePayloadGQO( OfferGQO productOffer,  ActionGQO action,  Collection<ProductOfferOfflineErrorGQO> productOfferOfflineErrors) {
        this.productOffer = productOffer;
        this.action = action;
        this.productOfferOfflineErrors = productOfferOfflineErrors;
    }

}