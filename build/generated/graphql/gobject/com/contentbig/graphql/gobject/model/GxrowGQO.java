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
public class GxrowGQO implements NodeGQO{


    private Integer rowNo;

    private Collection<GxcellGQO> cells;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;
    @lombok.NonNull
    private String id;

    public GxrowGQO() {
    }

    public GxrowGQO( Integer rowNo,  Collection<GxcellGQO> cells,  PersonGQO creator,  java.util.Date dateCreated,  java.util.Date dateModified,  String id) {
        this.rowNo = rowNo;
        this.cells = cells;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.id = id;
    }

}