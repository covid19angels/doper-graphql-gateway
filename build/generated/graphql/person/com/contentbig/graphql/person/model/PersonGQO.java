package com.contentbig.graphql.person.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.person.api.*;
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
public class PersonGQO implements PartyGQO, NodeGQO{

    @lombok.NonNull
    private String personalID;
    @lombok.NonNull
    private String name;

    private String alternateName;

    private String description;

    private Collection<OwnershipGQO> owns;

    private String familyName;

    private String givenName;

    private java.util.Date birthDate;

    private PlaceGQO birthPlace;

    private String gender;

    private String email;

    private Collection<PersonGQO> follows;

    private Collection<PersonGQO> followees;

    private Collection<MemberRoleGQO> membersOf;

    private UserGQO hasUser;

    private Collection<ContactPointGQO> hasContactPoint;
    @lombok.NonNull
    private String id;

    public PersonGQO() {
    }

    public PersonGQO( String personalID,  String name,  String alternateName,  String description,  Collection<OwnershipGQO> owns,  String familyName,  String givenName,  java.util.Date birthDate,  PlaceGQO birthPlace,  String gender,  String email,  Collection<PersonGQO> follows,  Collection<PersonGQO> followees,  Collection<MemberRoleGQO> membersOf,  UserGQO hasUser,  Collection<ContactPointGQO> hasContactPoint,  String id) {
        this.personalID = personalID;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.owns = owns;
        this.familyName = familyName;
        this.givenName = givenName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.email = email;
        this.follows = follows;
        this.followees = followees;
        this.membersOf = membersOf;
        this.hasUser = hasUser;
        this.hasContactPoint = hasContactPoint;
        this.id = id;
    }

}