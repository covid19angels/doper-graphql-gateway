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
public class ItemCategoryGQO implements NodeGQO{

    @lombok.NonNull
    private String itcgID;

    private String name;

    private String alternateName;

    private String description;

    private Integer orderQty;
    @lombok.NonNull
    private String id;

    public ItemCategoryGQO() {
    }

    public ItemCategoryGQO( String itcgID,  String name,  String alternateName,  String description,  Integer orderQty,  String id) {
        this.itcgID = itcgID;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.orderQty = orderQty;
        this.id = id;
    }

}