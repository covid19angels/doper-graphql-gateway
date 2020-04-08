package com.contentbig.kobylynskyi.bikeshop.graphql.mappers;

import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeInputTO;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTO;
import com.contentbig.kobylynskyi.bikeshop.graphql.model.BikeTypeTO;
import com.contentbig.kobylynskyi.bikeshop.model.Bike;
import com.contentbig.kobylynskyi.bikeshop.model.BikeType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BikeMapper {

    BikeTO map(Bike from);

    @Mapping(target = "id", ignore = true) // auto-generated
    @Mapping(target = "addedDateTime", ignore = true)
        // set in the service
    Bike mapInput(BikeInputTO from);

    BikeType mapInputType(BikeTypeTO type);

}
