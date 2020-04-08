package com.contentbig.graphql.shoppingcart.resolvers;

import com.contentbig.graphql.shoppingcart.model.CheckoutItemGQO;
import com.contentbig.graphql.shoppingcart.model.DiscountApplicationGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import com.contentbig.graphql.shoppingcart.api.Resolvers;
import com.contentbig.graphql.shoppingcart.model.CheckoutGQO;
import org.springframework.stereotype.Service;

@Service
class CheckoutResolver implements Resolvers.Checkout,GraphQLResolver<CheckoutGQO> {


    @Override
    public Connection<DiscountApplicationGQO> discountApplications(CheckoutGQO parent, Integer first, String after, Integer last, String before, Boolean reverse, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<CheckoutItemGQO> lineItems(CheckoutGQO parent, Integer first, String after, Integer last, String before, Boolean reverse, DataFetchingEnvironment env) {
        return null;
    }

}