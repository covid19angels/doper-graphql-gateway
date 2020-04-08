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
public class UpdateCartItemInputGQO {


    private String clientMutationId;
    @lombok.NonNull
    private String cartId;
    @lombok.NonNull
    private String id;

    private String name;

    private String description;

    private CartItemTypeGQO type;

    private Collection<String> images;

    private Integer price;

    private Integer quantity;

    public UpdateCartItemInputGQO() {
    }

    public UpdateCartItemInputGQO( String clientMutationId,  String cartId,  String id,  String name,  String description,  CartItemTypeGQO type,  Collection<String> images,  Integer price,  Integer quantity) {
        this.clientMutationId = clientMutationId;
        this.cartId = cartId;
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.images = images;
        this.price = price;
        this.quantity = quantity;
    }

}