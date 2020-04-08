package com.contentbig.kobylynskyi.bikeshop.graphql.api;

import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeInputTO;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTO;

public interface NewBikeMutation {

    BikeTO newBike(BikeInputTO bike) throws Exception;

}