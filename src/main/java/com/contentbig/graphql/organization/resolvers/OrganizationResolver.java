package com.contentbig.graphql.organization.resolvers;

import com.contentbig.graphql.organization.api.Resolvers;
import com.contentbig.graphql.organization.model.MemberRoleGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import com.contentbig.graphql.organization.model.EmployeeRoleGQO;
import com.contentbig.graphql.organization.model.OrganizationGQO;
import org.springframework.stereotype.Service;

@Service
class OrganizationResolver implements Resolvers.Organization,GraphQLResolver<OrganizationGQO> {

    @Override
    public Connection<EmployeeRoleGQO> employeesPage(OrganizationGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(OrganizationGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}
