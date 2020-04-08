package com.contentbig.graphql.shoppingman.mutation;

import com.contentbig.graphql.shoppingman.api.Mutation;
import com.contentbig.graphql.shoppingman.model.*;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class ShoppingmanMutationResolver implements Mutation,GraphQLMutationResolver {


  @Override
  public @NonNull ProductCreatePayloadGQO productCreate(ProductCreateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull ProductUpdatePayloadGQO productUpdate(ProductUpdateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull ProductModelCreatePayloadGQO productModelCreate(ProductModelCreateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull ProductModelUpdatePayloadGQO productModelUpdate(ProductModelUpdateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull ProductOfferCreatePayloadGQO productOfferCreate(ProductOfferCreateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull ProductOfferUpdatePayloadGQO productOfferUpdate(ProductOfferUpdateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull ProductOfferOnlinePayloadGQO productOfferOnline(ProductOfferOnlineInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull ProductOfferOfflinePayloadGQO productOfferOffline(ProductOfferOfflineInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}