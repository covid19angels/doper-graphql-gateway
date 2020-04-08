package com.contentbig.graphql.shoppingman.api;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.shoppingman.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Mutation {
// KK
    @lombok.NonNull
    ProductCreatePayloadGQO productCreate(ProductCreateInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    ProductUpdatePayloadGQO productUpdate(ProductUpdateInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    ProductModelCreatePayloadGQO productModelCreate(ProductModelCreateInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    ProductModelUpdatePayloadGQO productModelUpdate(ProductModelUpdateInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    ProductOfferCreatePayloadGQO productOfferCreate(ProductOfferCreateInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    ProductOfferUpdatePayloadGQO productOfferUpdate(ProductOfferUpdateInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    ProductOfferOnlinePayloadGQO productOfferOnline(ProductOfferOnlineInputGQO input, DataFetchingEnvironment env) throws Exception;
    @lombok.NonNull
    ProductOfferOfflinePayloadGQO productOfferOffline(ProductOfferOfflineInputGQO input, DataFetchingEnvironment env) throws Exception;
}