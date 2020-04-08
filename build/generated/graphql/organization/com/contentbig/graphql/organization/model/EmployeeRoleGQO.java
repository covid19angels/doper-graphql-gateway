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
public class EmployeeRoleGQO implements NodeGQO{


    private PersonGQO person;

    private String number;

    private OrgRoleNameGQO roleName;

    private OrganizationGQO hostingOrganization;

    private java.util.Date startDate;

    private java.util.Date endDate;
    @lombok.NonNull
    private String id;

    public EmployeeRoleGQO() {
    }

    public EmployeeRoleGQO( PersonGQO person,  String number,  OrgRoleNameGQO roleName,  OrganizationGQO hostingOrganization,  java.util.Date startDate,  java.util.Date endDate,  String id) {
        this.person = person;
        this.number = number;
        this.roleName = roleName;
        this.hostingOrganization = hostingOrganization;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
    }

}