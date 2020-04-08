package com.contentbig.graphql.place.api;

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
    public interface Store {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(StoreGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(StoreGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface Childcare {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(ChildcareGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(ChildcareGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface Eldercare {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(EldercareGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(EldercareGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface DefaultPlace {
    // KK
    }
    public interface AdministrativeArea {
    // KK
    }
    public interface GeoCoordinates {
    // KK
    }
    public interface StoreCreatePayload {
    // KK
    }
    public interface StoreCreateError {
    // KK
    }
    public interface StoreUpdatePayload {
    // KK
    }
    public interface StoreUpdateError {
    // KK
    }
    public interface Place {
    // KK
    }
    public interface LocalBusiness {
    // KK
    }
}