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

public interface PsaTimelineQuery {
// KK
    PersonActivityTimelineGQO psaTimeline(String id, String patlID, DataFetchingEnvironment env) throws Exception;
}