package com.contentbig.graphql.person.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.person.api.*;
import com.contentbig.graphql.organization.model.*;
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
public class ContactPointGQO implements NodeGQO{


    private java.lang.String areaServed;

    private String email;

    private String faxNumber;

    private OpeningHoursSpecificationGQO hoursAvailable;

    private String telephone;
    @lombok.NonNull
    private String id;

    public ContactPointGQO() {
    }

    public ContactPointGQO( java.lang.String areaServed,  String email,  String faxNumber,  OpeningHoursSpecificationGQO hoursAvailable,  String telephone,  String id) {
        this.areaServed = areaServed;
        this.email = email;
        this.faxNumber = faxNumber;
        this.hoursAvailable = hoursAvailable;
        this.telephone = telephone;
        this.id = id;
    }

}