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

public class Resolvers{
    public interface SoftwareApplication {
    // KK
    }
    public interface Webhook {
    // KK
    }
    public interface WebhookAddPayload {
    // KK
        public Connection<WebhookGQO> webhookSearch(WebhookAddPayloadGQO parent,WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface WebhookAddError {
    // KK
    }
    public interface WebhookUpdatePayload {
    // KK
        public Connection<WebhookGQO> webhookSearch(WebhookUpdatePayloadGQO parent,WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
    public interface WebhookUpdateError {
    // KK
    }
    public interface WebhookDeletePayload {
    // KK
        public Connection<WebhookGQO> webhookSearch(WebhookDeletePayloadGQO parent,WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env);
    }
}