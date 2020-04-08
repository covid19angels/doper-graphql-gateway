package com.contentbig.graphql.softwareapplication.api;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.softwareapplication.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    public Connection<SoftwareApplicationGQO> softwareapplicationSearch(String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    SoftwareApplicationGQO softwareapplicationFind(String id, String softwareApplicationID, DataFetchingEnvironment env) throws Exception;
    WebhookGQO webhookFind(String id, String webhookID, DataFetchingEnvironment env) throws Exception;
    public Connection<WebhookGQO> webhookSearch(WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
}