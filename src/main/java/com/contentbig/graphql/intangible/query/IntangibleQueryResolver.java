package com.contentbig.graphql.intangible.query;

import com.contentbig.graphql.intangible.api.Query;
import com.contentbig.graphql.intangible.model.BrandGQO;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.relay.Connection;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;


@Service
public class IntangibleQueryResolver implements Query, GraphQLQueryResolver {


    @Override
    public Connection<BrandGQO> allBrand(String after, Integer first, String before, Integer last, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public BrandGQO brand(String id, String brandID, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}