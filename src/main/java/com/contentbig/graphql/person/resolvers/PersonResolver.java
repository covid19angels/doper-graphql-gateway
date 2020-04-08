package com.contentbig.graphql.person.resolvers;

import com.contentbig.graphql.person.api.Resolvers;
import com.contentbig.graphql.person.model.PersonGQO;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import com.contentbig.graphql.organization.model.MemberRoleGQO;
import org.springframework.stereotype.Service;

@Service
class PersonResolver implements Resolvers.Person,GraphQLResolver<PersonGQO> {


    @Override
    public Connection<MemberRoleGQO> membersOfPage(PersonGQO parent, String after, Integer first, String before, Integer last, String orgId, DataFetchingEnvironment env) {
        return null;
    }
}