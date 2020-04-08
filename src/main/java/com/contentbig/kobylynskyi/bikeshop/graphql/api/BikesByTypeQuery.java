package com.contentbig.kobylynskyi.bikeshop.graphql.api;

import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTO;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTypeTO;

import java.util.Collection;

public interface BikesByTypeQuery {

    Collection<BikeTO> bikesByType(BikeTypeTO type) throws Exception;

}