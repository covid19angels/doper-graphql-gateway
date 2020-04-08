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
public class DiscountAllocationGQO implements NodeGQO{

    @lombok.NonNull
    private MoneyGQO allocatedAmount;
    @lombok.NonNull
    private DiscountApplicationGQO discountApplication;
    @lombok.NonNull
    private String id;

    public DiscountAllocationGQO() {
    }

    public DiscountAllocationGQO( MoneyGQO allocatedAmount,  DiscountApplicationGQO discountApplication,  String id) {
        this.allocatedAmount = allocatedAmount;
        this.discountApplication = discountApplication;
        this.id = id;
    }

}