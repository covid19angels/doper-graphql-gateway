package com.contentbig.graphql.gobject.api;

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
import com.contentbig.graphql.gobject.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    GxcelObjectGQO gxcel(String id, String gxcelID, DataFetchingEnvironment env) throws Exception;
    GeneralObjectGQO generalObject(String id, String gID, DataFetchingEnvironment env) throws Exception;
    ImageObjectGQO imageObject(String id, String gID, DataFetchingEnvironment env) throws Exception;
    AudioObjectGQO audioObject(String id, String gID, DataFetchingEnvironment env) throws Exception;
    VideoObjectGQO videoObject(String id, String gID, DataFetchingEnvironment env) throws Exception;
    GObjectGQO gobject(String id, String gobjectID, DataFetchingEnvironment env) throws Exception;
}