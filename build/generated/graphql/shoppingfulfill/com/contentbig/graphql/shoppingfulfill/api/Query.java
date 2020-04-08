package com.contentbig.graphql.shoppingfulfill.api;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    ParcelDeliveryGQO parcelDelivery(String id, String parelId, DataFetchingEnvironment env) throws Exception;
    HomeserviceDeliveryGQO homeserviceDelivery(String id, String srvId, DataFetchingEnvironment env) throws Exception;
}