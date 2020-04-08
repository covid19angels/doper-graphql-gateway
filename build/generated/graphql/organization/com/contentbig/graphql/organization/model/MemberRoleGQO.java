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
public class MemberRoleGQO implements NodeGQO{


    private PersonGQO member;

    private OrgRoleNameGQO roleName;

    private OrganizationGQO hostingOrganization;

    private String membershipNumber;

    private java.util.Date startDate;

    private java.util.Date endDate;

    private java.util.Date createdAt;

    private PersonGQO creator;
    @lombok.NonNull
    private String id;

    public MemberRoleGQO() {
    }

    public MemberRoleGQO( PersonGQO member,  OrgRoleNameGQO roleName,  OrganizationGQO hostingOrganization,  String membershipNumber,  java.util.Date startDate,  java.util.Date endDate,  java.util.Date createdAt,  PersonGQO creator,  String id) {
        this.member = member;
        this.roleName = roleName;
        this.hostingOrganization = hostingOrganization;
        this.membershipNumber = membershipNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
        this.creator = creator;
        this.id = id;
    }

}