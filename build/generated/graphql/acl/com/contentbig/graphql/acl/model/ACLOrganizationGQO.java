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
public class ACLOrganizationGQO implements ACLPartyGQO{


    private OrganizationGQO organization;

    private Collection<ACLNamespaceGQO> hasNamespace;

    private Collection<ACLGroupGQO> hasAclg;

    public ACLOrganizationGQO() {
    }

    public ACLOrganizationGQO( OrganizationGQO organization,  Collection<ACLNamespaceGQO> hasNamespace,  Collection<ACLGroupGQO> hasAclg) {
        this.organization = organization;
        this.hasNamespace = hasNamespace;
        this.hasAclg = hasAclg;
    }

}