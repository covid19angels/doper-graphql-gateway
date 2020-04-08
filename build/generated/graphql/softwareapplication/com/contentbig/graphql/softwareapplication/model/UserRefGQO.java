package com.contentbig.graphql.softwareapplication.model;

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
import com.contentbig.graphql.zommon.model.*;
import com.contentbig.graphql.softwareapplication.api.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class UserRefGQO {


    private String id;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private String username;

    private String password;

    private String bio;

    private PersonRefGQO isUserOf;

    public UserRefGQO() {
    }

    public UserRefGQO( String id,  String identifier,  String name,  String alternateName,  String description,  String username,  String password,  String bio,  PersonRefGQO isUserOf) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.isUserOf = isUserOf;
    }

}