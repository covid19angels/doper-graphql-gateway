package com.contentbig.graphql.person.api;

import com.contentbig.graphql.shoppingcart.model.*;
import com.contentbig.graphql.person.model.*;
import java.util.*;
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

public class Resolvers{
    public interface Person {
    // KK
        public Connection<MemberRoleGQO> membersOfPage(PersonGQO parent,String after, Integer first, String before, Integer last, String orgId, DataFetchingEnvironment env);
    }
    public interface User {
    // KK
    }
    public interface UserSigninPayload {
    // KK
    }
    public interface UserSigninError {
    // KK
    }
    public interface UserRegisterPayload {
    // KK
    }
    public interface UserRegisterError {
    // KK
    }
    public interface UserSMSCodePayload {
    // KK
    }
    public interface UserSMSCodeError {
    // KK
    }
    public interface ContactPoint {
    // KK
    }
}