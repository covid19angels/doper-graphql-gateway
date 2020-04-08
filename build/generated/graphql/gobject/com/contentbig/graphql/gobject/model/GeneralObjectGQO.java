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
public class GeneralObjectGQO implements GObjectGQO, NodeGQO{

    @lombok.NonNull
    private String name;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;

    private Integer contentSize;

    private java.lang.String contentUrl;
    @lombok.NonNull
    private String id;

    public GeneralObjectGQO() {
    }

    public GeneralObjectGQO( String name,  PersonGQO creator,  java.util.Date dateCreated,  java.util.Date dateModified,  Integer contentSize,  java.lang.String contentUrl,  String id) {
        this.name = name;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.contentSize = contentSize;
        this.contentUrl = contentUrl;
        this.id = id;
    }

}