package com.contentbig.kobylynskyi.bikeshop.graphql.api;

import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTO;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTypeTO;

import java.util.Collection;

public interface Query {

    Collection<BikeTO> bikes() throws Exception;

    Collection<BikeTO> bikesByType(BikeTypeTO type) throws Exception;

}