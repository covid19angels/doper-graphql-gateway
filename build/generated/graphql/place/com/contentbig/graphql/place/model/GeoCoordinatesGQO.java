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
public class GeoCoordinatesGQO implements NodeGQO{


    private Integer elevation;

    private Integer latitude;

    private Integer longitude;

    private String postalCode;
    @lombok.NonNull
    private String id;

    public GeoCoordinatesGQO() {
    }

    public GeoCoordinatesGQO( Integer elevation,  Integer latitude,  Integer longitude,  String postalCode,  String id) {
        this.elevation = elevation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.postalCode = postalCode;
        this.id = id;
    }

}