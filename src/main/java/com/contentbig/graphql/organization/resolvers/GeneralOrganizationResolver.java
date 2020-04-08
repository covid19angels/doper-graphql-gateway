package com.contentbig.graphql.organization.resolvers;

import com.contentbig.graphql.organization.api.Resolvers;
import com.contentbig.graphql.organization.model.EmployeeRoleGQO;
import com.contentbig.graphql.organization.model.GeneralOrganizationGQO;
import com.contentbig.graphql.organization.model.MemberRoleGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;

@Service
class GeneralOrganizationResolver implements Resolvers.GeneralOrganization,GraphQLResolver<GeneralOrganizationGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(GeneralOrganizationGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(GeneralOrganizationGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}