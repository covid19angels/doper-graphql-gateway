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
public class ProductModelUpdatePayloadGQO {


    private ProductModelGQO productModel;

    private ActionGQO action;
    @lombok.NonNull
    private Collection<ProductModelUpdateErrorGQO> productModelUpdateErrors;

    public ProductModelUpdatePayloadGQO() {
    }

    public ProductModelUpdatePayloadGQO( ProductModelGQO productModel,  ActionGQO action,  Collection<ProductModelUpdateErrorGQO> productModelUpdateErrors) {
        this.productModel = productModel;
        this.action = action;
        this.productModelUpdateErrors = productModelUpdateErrors;
    }

}