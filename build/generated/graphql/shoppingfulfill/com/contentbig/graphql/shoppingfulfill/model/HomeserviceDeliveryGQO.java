package com.contentbig.graphql.shoppingfulfill.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.shoppingfulfill.api.*;
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
public class HomeserviceDeliveryGQO implements FulfillDeliveryGQO, NodeGQO{


    private PostalAddressGQO deliveryAddress;

    private Collection<DeliveryEventGQO> deliveryStatus;

    private java.util.Date expectedArrivalFrom;

    private java.util.Date expectedArrivalUntil;

    private DeliveryMethodGQO hasDeliveryMethod;

    private Collection<ProductGQO> itemShipped;

    private PostalAddressGQO originAddress;

    private PoderGQO partOfPoder;

    private PartyGQO provider;

    private java.lang.String trackingNumber;

    private java.lang.String trackingUrl;
    @lombok.NonNull
    private String id;

    public HomeserviceDeliveryGQO() {
    }

    public HomeserviceDeliveryGQO( PostalAddressGQO deliveryAddress,  Collection<DeliveryEventGQO> deliveryStatus,  java.util.Date expectedArrivalFrom,  java.util.Date expectedArrivalUntil,  DeliveryMethodGQO hasDeliveryMethod,  Collection<ProductGQO> itemShipped,  PostalAddressGQO originAddress,  PoderGQO partOfPoder,  PartyGQO provider,  java.lang.String trackingNumber,  java.lang.String trackingUrl,  String id) {
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = deliveryStatus;
        this.expectedArrivalFrom = expectedArrivalFrom;
        this.expectedArrivalUntil = expectedArrivalUntil;
        this.hasDeliveryMethod = hasDeliveryMethod;
        this.itemShipped = itemShipped;
        this.originAddress = originAddress;
        this.partOfPoder = partOfPoder;
        this.provider = provider;
        this.trackingNumber = trackingNumber;
        this.trackingUrl = trackingUrl;
        this.id = id;
    }

}