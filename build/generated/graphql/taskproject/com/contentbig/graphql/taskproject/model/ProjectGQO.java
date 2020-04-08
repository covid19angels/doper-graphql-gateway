package com.contentbig.graphql.taskproject.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.taskproject.api.*;
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
public class ProjectGQO implements ThingGQO, OrganizationGQO, ConversationalThingGQO, NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private Collection<OrganizationGQO> parentOrganization;

    private Collection<OrganizationGQO> subOrganizations;

    private Collection<OrganizationGQO> departments;

    private Collection<EmployeeRoleGQO> employees;

    private Collection<PersonGQO> followers;

    private Collection<MemberRoleGQO> members;

    private Collection<ActionGQO> potentialActions;

    private Collection<OrgRoleNameGQO> hasOrgRoleName;

    private Collection<ConversationGQO> availableConversations;

    private ConversationGQO defaultConversation;

    private Collection<TaskGQO> hasPart;

    private PartyGQO sponsor;

    private PersonGQO manager;
    @lombok.NonNull
    private String id;

    public ProjectGQO() {
    }

    public ProjectGQO( String name,  String alternateName,  String description,  Collection<OrganizationGQO> parentOrganization,  Collection<OrganizationGQO> subOrganizations,  Collection<OrganizationGQO> departments,  Collection<EmployeeRoleGQO> employees,  Collection<PersonGQO> followers,  Collection<MemberRoleGQO> members,  Collection<ActionGQO> potentialActions,  Collection<OrgRoleNameGQO> hasOrgRoleName,  Collection<ConversationGQO> availableConversations,  ConversationGQO defaultConversation,  Collection<TaskGQO> hasPart,  PartyGQO sponsor,  PersonGQO manager,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.followers = followers;
        this.members = members;
        this.potentialActions = potentialActions;
        this.hasOrgRoleName = hasOrgRoleName;
        this.availableConversations = availableConversations;
        this.defaultConversation = defaultConversation;
        this.hasPart = hasPart;
        this.sponsor = sponsor;
        this.manager = manager;
        this.id = id;
    }

}