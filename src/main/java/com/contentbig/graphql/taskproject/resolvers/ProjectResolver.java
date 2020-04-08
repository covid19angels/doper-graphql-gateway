package com.contentbig.graphql.taskproject.resolvers;

import com.contentbig.graphql.taskproject.api.Resolvers;
import com.contentbig.graphql.taskproject.model.ProjectGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import com.contentbig.graphql.organization.model.EmployeeRoleGQO;
import com.contentbig.graphql.organization.model.MemberRoleGQO;
import org.springframework.stereotype.Service;

@Service
class ProjectResolver implements Resolvers.Project,GraphQLResolver<ProjectGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(ProjectGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(ProjectGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}