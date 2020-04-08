package com.contentbig.graphql.place.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.place.api.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class AdministrativeAreaGQO implements PlaceGQO, NodeGQO{


    private String address;

    private PlaceGQO containedInPlace;

    private Collection<PlaceGQO> containsPlaces;

    private GeoCoordinatesGQO geo;
    @lombok.NonNull
    private String id;

    public AdministrativeAreaGQO() {
    }

    public AdministrativeAreaGQO( String address,  PlaceGQO containedInPlace,  Collection<PlaceGQO> containsPlaces,  GeoCoordinatesGQO geo,  String id) {
        this.address = address;
        this.containedInPlace = containedInPlace;
        this.containsPlaces = containsPlaces;
        this.geo = geo;
        this.id = id;
    }

}