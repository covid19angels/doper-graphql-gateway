package com.contentbig.graphql.action.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.action.api.*;
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
public class EntryPointGQO implements NodeGQO{


    private java.lang.String urlTemplate;
    @lombok.NonNull
    private String id;

    public EntryPointGQO() {
    }

    public EntryPointGQO( java.lang.String urlTemplate,  String id) {
        this.urlTemplate = urlTemplate;
        this.id = id;
    }

}