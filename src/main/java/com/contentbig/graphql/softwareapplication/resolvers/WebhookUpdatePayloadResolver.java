package com.contentbig.graphql.softwareapplication.resolvers;

import com.contentbig.graphql.softwareapplication.model.WebhookFilterGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookOrderGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookUpdatePayloadGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;

@Service
class WebhookUpdatePayloadResolver implements GraphQLResolver<WebhookUpdatePayloadGQO> {

    public Connection<WebhookGQO> webhookSearch(WebhookUpdatePayloadGQO webhookUpdatePayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order,
                                                Integer first, Integer offset, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}