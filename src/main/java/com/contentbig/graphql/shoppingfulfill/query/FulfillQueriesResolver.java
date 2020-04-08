package com.contentbig.graphql.shoppingfulfill.query;

import com.contentbig.graphql.shoppingfulfill.api.Query;
import com.contentbig.graphql.shoppingfulfill.model.ParcelDeliveryGQO;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import com.contentbig.graphql.shoppingfulfill.model.HomeserviceDeliveryGQO;
import org.springframework.stereotype.Service;


@Service
public class FulfillQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public ParcelDeliveryGQO parcelDelivery(String id, String parelId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}