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
public class PoderItemGQO implements NodeGQO{


    private PoderGQO partOfPoder;

    private FulfillDeliveryGQO poderDelivery;

    private String poderItemNumber;

    private PoderStatusGQO poderItemStatus;

    private Integer poderQuantity;

    private ShoppingableGQO poderedItem;

    private Collection<ActionGQO> potentialActions;
    @lombok.NonNull
    private String id;

    public PoderItemGQO() {
    }

    public PoderItemGQO( PoderGQO partOfPoder,  FulfillDeliveryGQO poderDelivery,  String poderItemNumber,  PoderStatusGQO poderItemStatus,  Integer poderQuantity,  ShoppingableGQO poderedItem,  Collection<ActionGQO> potentialActions,  String id) {
        this.partOfPoder = partOfPoder;
        this.poderDelivery = poderDelivery;
        this.poderItemNumber = poderItemNumber;
        this.poderItemStatus = poderItemStatus;
        this.poderQuantity = poderQuantity;
        this.poderedItem = poderedItem;
        this.potentialActions = potentialActions;
        this.id = id;
    }

}