package com.contentbig.graphql.acl.api;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.action.model.*;
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
    ACLRoleGQO aclRoleFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLGroupGQO aclGroupFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLOrganizationGQO aclOrganizationFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLUserGQO aclUserFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLResourcePropertyGQO aclResourcePropertyFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLMetadataGQO aclMetadata(String id, String ugId, DataFetchingEnvironment env) throws Exception;
}