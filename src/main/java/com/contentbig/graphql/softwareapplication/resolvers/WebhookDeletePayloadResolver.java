package com.contentbig.graphql.softwareapplication.resolvers;

import com.contentbig.graphql.softwareapplication.model.WebhookDeletePayloadGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookFilterGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookGQO;
import com.contentbig.graphql.softwareapplication.model.WebhookOrderGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;

@Service
class WebhookDeletePayloadResolver implements GraphQLResolver<WebhookDeletePayloadGQO> {

    public Connection<WebhookGQO> webhookSearch(WebhookDeletePayloadGQO webhookDeletePayloadGQO, WebhookFilterGQO filter, WebhookOrderGQO order,
                                                Integer first, Integer offset, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}