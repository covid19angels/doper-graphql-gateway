package com.contentbig.graphql.shoppingdoor.api;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    public Connection<ProductGQO> productSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    ProductGQO product(String id, String productID, DataFetchingEnvironment env) throws Exception;
    GeneralProductGQO generalProduct(String id, String productID, DataFetchingEnvironment env) throws Exception;
    public Connection<ServiceGQO> serviceSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    ServiceGQO service(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    FoodServiceGQO foodService(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    GeneralServiceGQO generalService(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    GovernmentServiceGQO governmentService(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    HousekeepingServiceGQO housekeepingService(String id, String serviceID, DataFetchingEnvironment env) throws Exception;
    ItemCategoryGQO itemCategory(String id, String itcgID, DataFetchingEnvironment env) throws Exception;
    OfferGQO offer(String id, String offerID, DataFetchingEnvironment env) throws Exception;
    DemandGQO demand(String id, String demandID, DataFetchingEnvironment env) throws Exception;
}