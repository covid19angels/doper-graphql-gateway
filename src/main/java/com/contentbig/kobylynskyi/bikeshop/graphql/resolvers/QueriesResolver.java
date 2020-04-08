package com.contentbig.kobylynskyi.bikeshop.graphql.resolvers;

import com.contentbig.kobylynskyi.bikeshop.graphql.api.Query;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTO;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTypeTO;
import com.contentbig.kobylynskyi.bikeshop.model.BikeType;
import com.contentbig.kobylynskyi.bikeshop.service.BikeService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import com.contentbig.kobylynskyi.bikeshop.graphql.mappers.BikeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static java.util.stream.Collectors.toList;

@Service
public class QueriesResolver implements Query, GraphQLQueryResolver {

    @Autowired
    private BikeService service;
    @Autowired
    private BikeMapper mapper;

    @Override
    public Collection<BikeTO> bikes() {
        return service.findAll().stream()
                .map(mapper::map)
                .collect(toList());
    }

    @Override
    public Collection<BikeTO> bikesByType(BikeTypeTO bikeTypeTO) {
        BikeType bikeType = mapper.mapInputType(bikeTypeTO);
        return service.findByType(bikeType).stream()
                .map(mapper::map)
                .collect(toList());
    }
}
