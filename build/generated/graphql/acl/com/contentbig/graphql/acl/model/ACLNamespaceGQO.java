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
public class ACLNamespaceGQO implements NodeGQO{


    private String namespace;

    private ACLPartyGQO isNamespaceOf;

    private Collection<ACLRoleGQO> hasRole;

    private Collection<ACLRoleBindingGQO> hasRoleBinding;

    private Collection<ThingGQO> hasBelongings;
    @lombok.NonNull
    private String id;

    public ACLNamespaceGQO() {
    }

    public ACLNamespaceGQO( String namespace,  ACLPartyGQO isNamespaceOf,  Collection<ACLRoleGQO> hasRole,  Collection<ACLRoleBindingGQO> hasRoleBinding,  Collection<ThingGQO> hasBelongings,  String id) {
        this.namespace = namespace;
        this.isNamespaceOf = isNamespaceOf;
        this.hasRole = hasRole;
        this.hasRoleBinding = hasRoleBinding;
        this.hasBelongings = hasBelongings;
        this.id = id;
    }

}