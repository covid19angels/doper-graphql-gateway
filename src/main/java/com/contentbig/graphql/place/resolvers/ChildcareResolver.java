package com.contentbig.graphql.place.resolvers;

import com.contentbig.graphql.place.api.Resolvers;
import com.contentbig.graphql.place.model.ChildcareGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import com.contentbig.graphql.organization.model.EmployeeRoleGQO;
import com.contentbig.graphql.organization.model.MemberRoleGQO;
import org.springframework.stereotype.Service;

@Service
class ChildcareResolver implements Resolvers.Childcare, GraphQLResolver<ChildcareGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(ChildcareGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(ChildcareGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}