package com.contentbig.graphql.organization.query;

import com.contentbig.graphql.organization.api.Query;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import com.contentbig.graphql.organization.model.GeneralOrganizationGQO;
import com.contentbig.graphql.organization.model.OrganizationGQO;
import org.springframework.stereotype.Service;


@Service
public class OrganizationQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public OrganizationGQO organization(String id, String organizationID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public GeneralOrganizationGQO generalOrganization(String id, String organizationID, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}