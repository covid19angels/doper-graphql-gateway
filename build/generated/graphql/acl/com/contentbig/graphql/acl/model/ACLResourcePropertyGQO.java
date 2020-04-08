package com.contentbig.graphql.acl.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.acl.api.*;
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
public class ACLResourcePropertyGQO {

    @lombok.NonNull
    private ACLPermitTypeGQO permit;
    @lombok.NonNull
    private ACLAccessTypeGQO act;
    @lombok.NonNull
    private String propertyName;

    public ACLResourcePropertyGQO() {
    }

    public ACLResourcePropertyGQO( ACLPermitTypeGQO permit,  ACLAccessTypeGQO act,  String propertyName) {
        this.permit = permit;
        this.act = act;
        this.propertyName = propertyName;
    }

}