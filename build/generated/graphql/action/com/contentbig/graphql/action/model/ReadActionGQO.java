package com.contentbig.graphql.action.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.action.api.*;
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
public class ReadActionGQO implements ActionGQO, NodeGQO{


    private Collection<PersonGQO> agent;

    private Collection<PersonGQO> participant;

    private ThingGQO object;

    private EntryPointGQO target;

    private java.util.Date startTime;

    private java.util.Date endTime;

    private PlaceGQO location;

    private String description;
    @lombok.NonNull
    private String id;

    public ReadActionGQO() {
    }

    public ReadActionGQO( Collection<PersonGQO> agent,  Collection<PersonGQO> participant,  ThingGQO object,  EntryPointGQO target,  java.util.Date startTime,  java.util.Date endTime,  PlaceGQO location,  String description,  String id) {
        this.agent = agent;
        this.participant = participant;
        this.object = object;
        this.target = target;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.description = description;
        this.id = id;
    }

}