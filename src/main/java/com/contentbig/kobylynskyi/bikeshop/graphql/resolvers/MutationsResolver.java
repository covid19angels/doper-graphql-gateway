package com.contentbig.kobylynskyi.bikeshop.graphql.resolvers;

import com.contentbig.kobylynskyi.bikeshop.graphql.api.Mutation;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeInputTO;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTO;
import com.contentbig.kobylynskyi.bikeshop.model.Bike;
import com.contentbig.kobylynskyi.bikeshop.service.BikeService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import com.contentbig.kobylynskyi.bikeshop.graphql.mappers.BikeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MutationsResolver implements Mutation, GraphQLMutationResolver {

    @Autowired
    private BikeService service;
    @Autowired
    private BikeMapper mapper;

    @Override
    public BikeTO newBike(BikeInputTO bikeInputTO) {
        Bike savedBike = service.create(mapper.mapInput(bikeInputTO));
        return mapper.map(savedBike);
    }

}
