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
public class SetCartItemInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String id;

    private String name;

    private String description;

    private CartItemTypeGQO type;

    private Collection<String> images;
    @lombok.NonNull
    private Integer price;

    private CurrencyInputGQO currency;

    private Integer quantity;

    private Collection<CustomAttributeInputGQO> attributes;

    public SetCartItemInputGQO() {
    }

    public SetCartItemInputGQO( String clientMutationId,  String id,  String name,  String description,  CartItemTypeGQO type,  Collection<String> images,  Integer price,  CurrencyInputGQO currency,  Integer quantity,  Collection<CustomAttributeInputGQO> attributes) {
        this.clientMutationId = clientMutationId;
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.images = images;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.attributes = attributes;
    }

}