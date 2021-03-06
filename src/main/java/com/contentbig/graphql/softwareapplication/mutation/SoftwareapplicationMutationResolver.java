package com.contentbig.graphql.softwareapplication.mutation;

import com.contentbig.graphql.softwareapplication.api.Mutation;
import com.contentbig.graphql.softwareapplication.model.*;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SoftwareapplicationMutationResolver implements Mutation,GraphQLMutationResolver {


  @Override
  public WebhookAddPayloadGQO webhookAdd(Collection<WebhookAddInputGQO> input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public WebhookUpdatePayloadGQO webhookUpdate(WebhookUpdateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public WebhookDeletePayloadGQO webhookDelete(WebhookFilterGQO filter, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}