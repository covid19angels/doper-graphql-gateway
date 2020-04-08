package com.contentbig.kobylynskyi.bikeshop.graphql.api;

import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTO;

import java.util.Collection;

public interface BikesQuery {

    Collection<BikeTO> bikes() throws Exception;

}