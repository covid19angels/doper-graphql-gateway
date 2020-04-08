package com.contentbig.graphql.shoppingcart.query;

import com.contentbig.graphql.shoppingcart.api.Query;
import com.contentbig.graphql.shoppingcart.model.*;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;



@Service
public class ShoppingCartQueriesResolver implements Query, GraphQLQueryResolver {


  @Override
  public CartGQO cart(String id, CurrencyInputGQO currency, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PoderGQO poder(String id, String poderID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public CheckoutGQO checkout(String id, String checkoutID, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public PostalAddressGQO postalAddress(String id, String paID, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}