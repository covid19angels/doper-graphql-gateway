package com.contentbig.graphql.softwareapplication.resolvers;

import com.contentbig.graphql.softwareapplication.model.WebhookAddPayloadGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookFilterGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookOrderGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;

@Service
class WebhookAddPayloadResolver implements GraphQLResolver<WebhookAddPayloadGQO> {

    public Connection<WebhookGQO> webhookSearch(WebhookAddPayloadGQO webhookAddPayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order,
                                                Integer first, Integer offset, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}