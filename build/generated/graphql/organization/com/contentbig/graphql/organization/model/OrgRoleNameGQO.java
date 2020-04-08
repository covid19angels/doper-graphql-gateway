package com.contentbig.graphql.organization.model;

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
import com.contentbig.graphql.organization.api.*;
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class OrgRoleNameGQO implements NodeGQO{


    private OrganizationGQO isRoleNameOf;

    private String group;

    private String name;

    private String alternativeHeadline;

    private String description;

    private java.util.Date createdAt;

    private PersonGQO creator;
    @lombok.NonNull
    private String id;

    public OrgRoleNameGQO() {
    }

    public OrgRoleNameGQO( OrganizationGQO isRoleNameOf,  String group,  String name,  String alternativeHeadline,  String description,  java.util.Date createdAt,  PersonGQO creator,  String id) {
        this.isRoleNameOf = isRoleNameOf;
        this.group = group;
        this.name = name;
        this.alternativeHeadline = alternativeHeadline;
        this.description = description;
        this.createdAt = createdAt;
        this.creator = creator;
        this.id = id;
    }

}