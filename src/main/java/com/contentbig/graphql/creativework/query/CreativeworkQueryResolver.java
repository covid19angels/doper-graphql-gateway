package com.contentbig.graphql.creativework.query;

import com.contentbig.graphql.creativework.api.Query;
import com.contentbig.graphql.creativework.model.BlogGQO;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;



@Service
public class CreativeworkQueryResolver implements Query, GraphQLQueryResolver {

  @Override
  public BlogGQO blog(String id, String blogId, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}