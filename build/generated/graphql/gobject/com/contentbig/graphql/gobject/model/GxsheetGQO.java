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
public class GxsheetGQO implements NodeGQO{


    private String name;

    private Collection<GxcolDefGQO> columndefs;

    private Collection<AggregateGxrowGQO> aggregateRows;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;
    @lombok.NonNull
    private String id;

    public GxsheetGQO() {
    }

    public GxsheetGQO( String name,  Collection<GxcolDefGQO> columndefs,  Collection<AggregateGxrowGQO> aggregateRows,  PersonGQO creator,  java.util.Date dateCreated,  java.util.Date dateModified,  String id) {
        this.name = name;
        this.columndefs = columndefs;
        this.aggregateRows = aggregateRows;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.id = id;
    }

}