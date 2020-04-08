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
public class ProductUpdatePayloadGQO {


    private ProductGQO product;

    private ActionGQO action;
    @lombok.NonNull
    private Collection<ProductUpdateErrorGQO> productUpdateErrors;

    public ProductUpdatePayloadGQO() {
    }

    public ProductUpdatePayloadGQO( ProductGQO product,  ActionGQO action,  Collection<ProductUpdateErrorGQO> productUpdateErrors) {
        this.product = product;
        this.action = action;
        this.productUpdateErrors = productUpdateErrors;
    }

}