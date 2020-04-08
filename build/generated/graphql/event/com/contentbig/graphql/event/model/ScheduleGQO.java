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
public class ScheduleGQO implements NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private DayOfWeekGQO byDay;

    private Integer byMonth;

    private Integer byMonthDay;

    private DurationGQO duration;

    private java.util.Date exceptDate;

    private Integer repeatCount;

    private DurationGQO repeatFrequency;
    @lombok.NonNull
    private String id;

    public ScheduleGQO() {
    }

    public ScheduleGQO( String name,  String alternateName,  String description,  DayOfWeekGQO byDay,  Integer byMonth,  Integer byMonthDay,  DurationGQO duration,  java.util.Date exceptDate,  Integer repeatCount,  DurationGQO repeatFrequency,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.byDay = byDay;
        this.byMonth = byMonth;
        this.byMonthDay = byMonthDay;
        this.duration = duration;
        this.exceptDate = exceptDate;
        this.repeatCount = repeatCount;
        this.repeatFrequency = repeatFrequency;
        this.id = id;
    }

}