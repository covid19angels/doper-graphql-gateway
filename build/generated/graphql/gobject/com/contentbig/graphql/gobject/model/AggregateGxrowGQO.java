package com.contentbig.graphql.gobject.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.person.model.*;
import com.contentbig.graphql.message.model.*;
import com.contentbig.graphql.acl.model.*;
import com.contentbig.graphql.shoppingfulfill.model.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.gobject.api.*;
import com.contentbig.graphql.zommon.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class AggregateGxrowGQO implements NodeGQO{


    private String name;

    private Collection<GxrowGQO> rows;
    @lombok.NonNull
    private String id;

    public AggregateGxrowGQO() {
    }

    public AggregateGxrowGQO( String name,  Collection<GxrowGQO> rows,  String id) {
        this.name = name;
        this.rows = rows;
        this.id = id;
    }

}