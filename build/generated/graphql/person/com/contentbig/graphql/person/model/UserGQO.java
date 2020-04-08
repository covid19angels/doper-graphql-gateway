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
public class UserGQO implements NodeGQO{

    @lombok.NonNull
    private String username;

    private String name;

    private String bio;
    @lombok.NonNull
    private java.lang.String bioHTML;
    @lombok.NonNull
    private PersonGQO isUserOf;
    @lombok.NonNull
    private String id;

    public UserGQO() {
    }

    public UserGQO( String username,  String name,  String bio,  java.lang.String bioHTML,  PersonGQO isUserOf,  String id) {
        this.username = username;
        this.name = name;
        this.bio = bio;
        this.bioHTML = bioHTML;
        this.isUserOf = isUserOf;
        this.id = id;
    }

}