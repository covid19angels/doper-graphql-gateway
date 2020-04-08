package com.contentbig.graphql.action.api;

import com.contentbig.graphql.shoppingcart.model.*;
import com.contentbig.graphql.action.model.*;
import java.util.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    CreateActionGQO createAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
    ReadActionGQO readAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
    UpdateActionGQO updateAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
    DeleteActionGQO deleteAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
    TransferActionGQO transferAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
    AuthorizeActionGQO authorizeAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
    AssignActionGQO assignAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
    RejectActionGQO rejectAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
    AcceptActionGQO acceptAction(String id, String actionId, DataFetchingEnvironment env) throws Exception;
}