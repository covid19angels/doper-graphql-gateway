package com.contentbig.graphql.shoppingdoor.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.shoppingdoor.api.*;
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
public class OpeningHoursSpecificationGQO implements NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private java.util.Date closes;

    private java.util.Date opens;

    private java.util.Date validFrom;

    private java.util.Date validThrough;
    @lombok.NonNull
    private String id;

    public OpeningHoursSpecificationGQO() {
    }

    public OpeningHoursSpecificationGQO( String name,  String alternateName,  String description,  java.util.Date closes,  java.util.Date opens,  java.util.Date validFrom,  java.util.Date validThrough,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.closes = closes;
        this.opens = opens;
        this.validFrom = validFrom;
        this.validThrough = validThrough;
        this.id = id;
    }

}