package com.contentbig.graphql.taskproject.api;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.taskproject.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    ProjectGQO project(String id, String projectID, DataFetchingEnvironment env) throws Exception;
    TaskGQO task(String id, String taskID, DataFetchingEnvironment env) throws Exception;
    IssueGQO issue(String id, String issueID, DataFetchingEnvironment env) throws Exception;
    PersonActivityTimelineGQO psaTimeline(String id, String patlID, DataFetchingEnvironment env) throws Exception;
}