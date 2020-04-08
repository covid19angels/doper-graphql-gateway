package com.contentbig.graphql.action.query;

import com.contentbig.graphql.action.api.Query;
import com.contentbig.graphql.action.model.*;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;



@Service
public class ActionQueriesResolver implements Query, GraphQLQueryResolver {


  @Override
  public CreateActionGQO createAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public ReadActionGQO readAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public UpdateActionGQO updateAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public DeleteActionGQO deleteAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public TransferActionGQO transferAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public AuthorizeActionGQO authorizeAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public AssignActionGQO assignAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public RejectActionGQO rejectAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public AcceptActionGQO acceptAction(String id, String actionId, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}