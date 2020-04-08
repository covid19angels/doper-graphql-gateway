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
public class ACLUserGQO implements ACLSubjectGQO, ACLPartyGQO{


    private UserGQO user;

    private Collection<ACLNamespaceGQO> hasNamespace;

    private Collection<ACLGroupGQO> hasAclg;

    public ACLUserGQO() {
    }

    public ACLUserGQO( UserGQO user,  Collection<ACLNamespaceGQO> hasNamespace,  Collection<ACLGroupGQO> hasAclg) {
        this.user = user;
        this.hasNamespace = hasNamespace;
        this.hasAclg = hasAclg;
    }

}