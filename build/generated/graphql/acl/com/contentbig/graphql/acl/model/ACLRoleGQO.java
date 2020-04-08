package com.contentbig.graphql.acl.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.acl.api.*;
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
public class ACLRoleGQO implements NodeGQO{


    private ACLPartyGQO isRoleOf;
    @lombok.NonNull
    private String name;
    @lombok.NonNull
    private Collection<ACLVerbGQO> verbs;
    @lombok.NonNull
    private Collection<ACLResourceGQO> objects;
    @lombok.NonNull
    private Collection<ACLNamespaceGQO> namespaces;

    private String alternateName;

    private String description;

    private Collection<ACLRoleBindingGQO> hasRolebinding;
    @lombok.NonNull
    private String id;

    public ACLRoleGQO() {
    }

    public ACLRoleGQO( ACLPartyGQO isRoleOf,  String name,  Collection<ACLVerbGQO> verbs,  Collection<ACLResourceGQO> objects,  Collection<ACLNamespaceGQO> namespaces,  String alternateName,  String description,  Collection<ACLRoleBindingGQO> hasRolebinding,  String id) {
        this.isRoleOf = isRoleOf;
        this.name = name;
        this.verbs = verbs;
        this.objects = objects;
        this.namespaces = namespaces;
        this.alternateName = alternateName;
        this.description = description;
        this.hasRolebinding = hasRolebinding;
        this.id = id;
    }

}