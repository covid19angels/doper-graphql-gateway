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
public class ACLRoleBindingGQO implements NodeGQO{


    private ACLNamespaceGQO isRolebindingOf;

    private ACLRoleGQO isBindingOf;

    private Collection<ACLSubjectGQO> subjects;
    @lombok.NonNull
    private String id;

    public ACLRoleBindingGQO() {
    }

    public ACLRoleBindingGQO( ACLNamespaceGQO isRolebindingOf,  ACLRoleGQO isBindingOf,  Collection<ACLSubjectGQO> subjects,  String id) {
        this.isRolebindingOf = isRolebindingOf;
        this.isBindingOf = isBindingOf;
        this.subjects = subjects;
        this.id = id;
    }

}