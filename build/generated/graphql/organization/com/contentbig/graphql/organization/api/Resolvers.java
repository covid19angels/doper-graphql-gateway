package com.contentbig.graphql.organization.api;

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

public class Resolvers{
    public interface Ownership {
    // KK
    }
    public interface GeneralOrganization {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(GeneralOrganizationGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(GeneralOrganizationGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface OrgRoleName {
    // KK
    }
    public interface MemberRole {
    // KK
    }
    public interface EmployeeRole {
    // KK
    }
    public interface Party {
    // KK
    }
    public interface Organization {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(OrganizationGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(OrganizationGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface Ownable {
    // KK
    }
}