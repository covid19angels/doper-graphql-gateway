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
public class CheckoutItemGQO implements NodeGQO{

    @lombok.NonNull
    private Collection<CustomAttributeGQO> customAttributes;
    @lombok.NonNull
    private Collection<DiscountAllocationGQO> discountAllocations;
    @lombok.NonNull
    private Integer quantity;
    @lombok.NonNull
    private String title;

    private ShoppingableGQO variant;
    @lombok.NonNull
    private String id;

    public CheckoutItemGQO() {
    }

    public CheckoutItemGQO( Collection<CustomAttributeGQO> customAttributes,  Collection<DiscountAllocationGQO> discountAllocations,  Integer quantity,  String title,  ShoppingableGQO variant,  String id) {
        this.customAttributes = customAttributes;
        this.discountAllocations = discountAllocations;
        this.quantity = quantity;
        this.title = title;
        this.variant = variant;
        this.id = id;
    }

}