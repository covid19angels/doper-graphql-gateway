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

public class Resolvers{
    public interface Project {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(ProjectGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(ProjectGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface Issue {
    // KK
        public Connection<UserGQO> participants(IssueGQO parent,String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    }
    public interface Task {
    // KK
    }
    public interface TaskAssignment {
    // KK
    }
    public interface TaskStatus {
    // KK
    }
    public interface PersonActivityTimeline {
    // KK
    }
}