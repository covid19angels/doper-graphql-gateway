package com.contentbig.graphql.place.mutation;

import com.contentbig.graphql.place.api.Mutation;
import com.contentbig.graphql.place.model.StoreCreateInputGQO;
import com.contentbig.graphql.place.model.StoreCreatePayloadGQO;
import com.contentbig.graphql.place.model.StoreUpdateInputGQO;
import com.contentbig.graphql.place.model.StoreUpdatePayloadGQO;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class PlaceMutationResolver implements Mutation, GraphQLMutationResolver {


  @Override
  public @NonNull StoreCreatePayloadGQO storeCreate(StoreCreateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull StoreUpdatePayloadGQO storeUpdate(StoreUpdateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}