package com.contentbig.graphql.place.resolvers;

import com.contentbig.graphql.place.api.Resolvers;
import com.contentbig.graphql.place.model.StoreGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import com.contentbig.graphql.organization.model.EmployeeRoleGQO;
import com.contentbig.graphql.organization.model.MemberRoleGQO;
import org.springframework.stereotype.Service;

@Service
class StoreResolver implements Resolvers.Store, GraphQLResolver<StoreGQO> {


    @Override
    public Connection<EmployeeRoleGQO> employeesPage(StoreGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<MemberRoleGQO> membersPage(StoreGQO parent, String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env) {
        return null;
    }
}