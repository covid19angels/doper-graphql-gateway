package com.contentbig.graphql.place.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.place.api.*;
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
public class StoreGQO implements ThingGQO, OrganizationGQO, LocalBusinessGQO, NodeGQO{


    private String openingHours;

    private String paymentAccepted;

    private String priceRange;

    private String name;

    private String alternateName;

    private String description;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;

    private Collection<OrganizationGQO> parentOrganization;

    private Collection<OrganizationGQO> subOrganizations;

    private Collection<OrganizationGQO> departments;

    private Collection<EmployeeRoleGQO> employees;

    private Collection<PersonGQO> followers;

    private Collection<MemberRoleGQO> members;

    private Collection<ActionGQO> potentialActions;

    private Collection<OrgRoleNameGQO> hasOrgRoleName;

    private Integer followernum;
    @lombok.NonNull
    private String id;

    public StoreGQO() {
    }

    public StoreGQO( String openingHours,  String paymentAccepted,  String priceRange,  String name,  String alternateName,  String description,  java.util.Date dateCreated,  java.util.Date dateModified,  Collection<OrganizationGQO> parentOrganization,  Collection<OrganizationGQO> subOrganizations,  Collection<OrganizationGQO> departments,  Collection<EmployeeRoleGQO> employees,  Collection<PersonGQO> followers,  Collection<MemberRoleGQO> members,  Collection<ActionGQO> potentialActions,  Collection<OrgRoleNameGQO> hasOrgRoleName,  Integer followernum,  String id) {
        this.openingHours = openingHours;
        this.paymentAccepted = paymentAccepted;
        this.priceRange = priceRange;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.followers = followers;
        this.members = members;
        this.potentialActions = potentialActions;
        this.hasOrgRoleName = hasOrgRoleName;
        this.followernum = followernum;
        this.id = id;
    }

}