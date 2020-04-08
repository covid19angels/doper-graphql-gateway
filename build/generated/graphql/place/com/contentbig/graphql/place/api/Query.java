package com.contentbig.graphql.place.api;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    DefaultPlaceGQO defaultPlaceFind(String id, String defID, DataFetchingEnvironment env) throws Exception;
    AdministrativeAreaGQO administrativeAreaFind(String id, String defID, DataFetchingEnvironment env) throws Exception;
    public Connection<StoreGQO> storeSearch(StoreFilterGQO filter, StoreOrderGQO order, String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    Collection<StoreGQO> storeSearch1(StoreFilterGQO filter, StoreOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env) throws Exception;
    StoreGQO storeFind(String id, String storeID, DataFetchingEnvironment env) throws Exception;
    ChildcareGQO childcareFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception;
    EldercareGQO eldercareFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception;
    public Connection<LocalBusinessGQO> localBusinessSearch(LocalBusinessFilterGQO filter, LocalBusinessOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    LocalBusinessGQO localBusinessFind(String id, String lbsID, DataFetchingEnvironment env) throws Exception;
}