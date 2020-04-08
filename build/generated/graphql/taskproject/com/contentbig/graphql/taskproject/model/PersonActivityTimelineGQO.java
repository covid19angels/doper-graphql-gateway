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
public class PersonActivityTimelineGQO implements NodeGQO{


    private PersonGQO about;

    private String name;

    private String alternateName;

    private String description;

    private Collection<ActionGQO> personActivities;
    @lombok.NonNull
    private String id;

    public PersonActivityTimelineGQO() {
    }

    public PersonActivityTimelineGQO( PersonGQO about,  String name,  String alternateName,  String description,  Collection<ActionGQO> personActivities,  String id) {
        this.about = about;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.personActivities = personActivities;
        this.id = id;
    }

}