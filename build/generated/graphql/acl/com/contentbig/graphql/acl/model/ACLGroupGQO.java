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
public class ACLGroupGQO implements ACLSubjectGQO, ThingGQO, NodeGQO{

    @lombok.NonNull
    private ACLPartyGQO isAclgOf;

    private String name;

    private String alternateName;

    private String description;

    private Collection<ACLUserGQO> member;
    @lombok.NonNull
    private String id;

    public ACLGroupGQO() {
    }

    public ACLGroupGQO( ACLPartyGQO isAclgOf,  String name,  String alternateName,  String description,  Collection<ACLUserGQO> member,  String id) {
        this.isAclgOf = isAclgOf;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.member = member;
        this.id = id;
    }

}