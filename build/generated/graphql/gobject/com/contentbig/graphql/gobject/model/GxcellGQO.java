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
public class GxcellGQO implements NodeGQO{


    private Integer colNo;

    private String value;

    private ThingGQO valueFrom;

    private String valueFormula;

    private PersonGQO editingBy;

    private java.util.Date editingStarted;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;
    @lombok.NonNull
    private String id;

    public GxcellGQO() {
    }

    public GxcellGQO( Integer colNo,  String value,  ThingGQO valueFrom,  String valueFormula,  PersonGQO editingBy,  java.util.Date editingStarted,  PersonGQO creator,  java.util.Date dateCreated,  java.util.Date dateModified,  String id) {
        this.colNo = colNo;
        this.value = value;
        this.valueFrom = valueFrom;
        this.valueFormula = valueFormula;
        this.editingBy = editingBy;
        this.editingStarted = editingStarted;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.id = id;
    }

}