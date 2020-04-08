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
public class IssueGQO implements ThingGQO, NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private PersonGQO creator;

    private Collection<PersonGQO> assignees;

    private Collection<TaskGQO> tasks;
    @lombok.NonNull
    private String id;

    public IssueGQO() {
    }

    public IssueGQO( String name,  String alternateName,  String description,  PersonGQO creator,  Collection<PersonGQO> assignees,  Collection<TaskGQO> tasks,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.creator = creator;
        this.assignees = assignees;
        this.tasks = tasks;
        this.id = id;
    }

}