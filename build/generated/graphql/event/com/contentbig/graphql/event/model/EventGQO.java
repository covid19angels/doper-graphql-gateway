package com.contentbig.graphql.event.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.event.api.*;
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
public class EventGQO implements NodeGQO{


    private ThingGQO about;

    private java.util.Date doorTime;

    private DurationGQO duration;

    private java.util.Date endDate;

    private ScheduleGQO eventSchedule;
    @lombok.NonNull
    private String id;

    public EventGQO() {
    }

    public EventGQO( ThingGQO about,  java.util.Date doorTime,  DurationGQO duration,  java.util.Date endDate,  ScheduleGQO eventSchedule,  String id) {
        this.about = about;
        this.doorTime = doorTime;
        this.duration = duration;
        this.endDate = endDate;
        this.eventSchedule = eventSchedule;
        this.id = id;
    }

}