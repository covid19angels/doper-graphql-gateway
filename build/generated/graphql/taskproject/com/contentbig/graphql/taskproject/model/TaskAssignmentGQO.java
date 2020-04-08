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
public class TaskAssignmentGQO implements NodeGQO{


    private TaskGQO about;

    private ReviewGQO comment;

    private PartyGQO assignee;

    private PartyGQO assigner;
    @lombok.NonNull
    private java.util.Date readAt;
    @lombok.NonNull
    private java.util.Date acceptedAt;
    @lombok.NonNull
    private java.util.Date assignedAt;
    @lombok.NonNull
    private String id;

    public TaskAssignmentGQO() {
    }

    public TaskAssignmentGQO( TaskGQO about,  ReviewGQO comment,  PartyGQO assignee,  PartyGQO assigner,  java.util.Date readAt,  java.util.Date acceptedAt,  java.util.Date assignedAt,  String id) {
        this.about = about;
        this.comment = comment;
        this.assignee = assignee;
        this.assigner = assigner;
        this.readAt = readAt;
        this.acceptedAt = acceptedAt;
        this.assignedAt = assignedAt;
        this.id = id;
    }

}