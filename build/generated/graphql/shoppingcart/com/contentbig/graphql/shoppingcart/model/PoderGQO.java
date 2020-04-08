package com.contentbig.graphql.shoppingcart.model;

import com.contentbig.graphql.shoppingcart.api.*;
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
public class PoderGQO implements NodeGQO{


    private PartyGQO broker;

    private PartyGQO customer;

    private Boolean isGift;

    private java.util.Date poderDate;

    private FulfillDeliveryGQO poderDelivery;

    private String poderNumber;

    private PoderStatusGQO poderStatus;

    private Collection<PoderItemGQO> poderedItem;

    private OrganizationGQO seller;

    private Collection<ActionGQO> potentialActions;
    @lombok.NonNull
    private String id;

    public PoderGQO() {
    }

    public PoderGQO( PartyGQO broker,  PartyGQO customer,  Boolean isGift,  java.util.Date poderDate,  FulfillDeliveryGQO poderDelivery,  String poderNumber,  PoderStatusGQO poderStatus,  Collection<PoderItemGQO> poderedItem,  OrganizationGQO seller,  Collection<ActionGQO> potentialActions,  String id) {
        this.broker = broker;
        this.customer = customer;
        this.isGift = isGift;
        this.poderDate = poderDate;
        this.poderDelivery = poderDelivery;
        this.poderNumber = poderNumber;
        this.poderStatus = poderStatus;
        this.poderedItem = poderedItem;
        this.seller = seller;
        this.potentialActions = potentialActions;
        this.id = id;
    }

}