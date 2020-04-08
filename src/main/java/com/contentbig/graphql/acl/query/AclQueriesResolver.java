package com.contentbig.graphql.acl.query;

import com.contentbig.config.CustomAuthGraphQLContext;
import com.contentbig.graphql.acl.api.Query;
import com.contentbig.graphql.acl.model.*;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AclQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public ACLRoleGQO aclRoleFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        CustomAuthGraphQLContext a = env.getContext();
        log.info(String.format("env.getContext() = %s",a.getAuthContext().toString()));
        return ACLRoleGQO.builder().name("rolename").alternateName("rolealtername").build();
    }

    @Override
    public ACLGroupGQO aclGroupFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLOrganizationGQO aclOrganizationFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLUserGQO aclUserFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLResourcePropertyGQO aclResourcePropertyFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLMetadataGQO aclMetadata(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}