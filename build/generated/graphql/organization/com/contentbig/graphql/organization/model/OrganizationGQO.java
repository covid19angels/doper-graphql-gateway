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

public interface OrganizationGQO {

    Collection<OrganizationGQO> getParentOrganization();
    Collection<OrganizationGQO> getSubOrganizations();
    Collection<OrganizationGQO> getDepartments();
    Collection<EmployeeRoleGQO> getEmployees();
    Collection<PersonGQO> getFollowers();
    Collection<MemberRoleGQO> getMembers();
    Collection<ActionGQO> getPotentialActions();
    Collection<OrgRoleNameGQO> getHasOrgRoleName();
}