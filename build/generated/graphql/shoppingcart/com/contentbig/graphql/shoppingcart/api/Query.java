package com.contentbig.graphql.shoppingcart.api;

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
    CartGQO cart(String id, CurrencyInputGQO currency, DataFetchingEnvironment env) throws Exception;
    PoderGQO poder(String id, String poderID, DataFetchingEnvironment env) throws Exception;
    CheckoutGQO checkout(String id, String checkoutID, DataFetchingEnvironment env) throws Exception;
    PostalAddressGQO postalAddress(String id, String paID, DataFetchingEnvironment env) throws Exception;
}