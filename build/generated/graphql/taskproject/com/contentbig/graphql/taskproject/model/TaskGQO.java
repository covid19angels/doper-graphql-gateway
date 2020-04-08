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
public class TaskGQO implements ThingGQO, NodeGQO{


    private IssueGQO about;

    private ProjectGQO isPartOf;

    private String wbsNO;

    private String name;

    private String alternateName;

    private String description;

    private TaskPriorityGQO priority;

    private PersonGQO creator;

    private Collection<PersonGQO> watcher;

    private java.util.Date planStart;

    private java.util.Date planFinish;

    private DurationGQO duration;

    private Integer percentComplete;
    @lombok.NonNull
    private java.util.Date createdAt;
    @lombok.NonNull
    private java.util.Date updatedAt;

    private TaskGQO parentTask;

    private TaskGQO previousTask;

    private Collection<TaskGQO> subTasks;

    private Collection<TaskGQO> dependsOn;

    private Collection<TaskAssignmentGQO> assignmentHistory;

    private TaskAssignmentGQO latestAssignment;

    private TaskStatusGQO status;
    @lombok.NonNull
    private String id;

    public TaskGQO() {
    }

    public TaskGQO( IssueGQO about,  ProjectGQO isPartOf,  String wbsNO,  String name,  String alternateName,  String description,  TaskPriorityGQO priority,  PersonGQO creator,  Collection<PersonGQO> watcher,  java.util.Date planStart,  java.util.Date planFinish,  DurationGQO duration,  Integer percentComplete,  java.util.Date createdAt,  java.util.Date updatedAt,  TaskGQO parentTask,  TaskGQO previousTask,  Collection<TaskGQO> subTasks,  Collection<TaskGQO> dependsOn,  Collection<TaskAssignmentGQO> assignmentHistory,  TaskAssignmentGQO latestAssignment,  TaskStatusGQO status,  String id) {
        this.about = about;
        this.isPartOf = isPartOf;
        this.wbsNO = wbsNO;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.priority = priority;
        this.creator = creator;
        this.watcher = watcher;
        this.planStart = planStart;
        this.planFinish = planFinish;
        this.duration = duration;
        this.percentComplete = percentComplete;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.parentTask = parentTask;
        this.previousTask = previousTask;
        this.subTasks = subTasks;
        this.dependsOn = dependsOn;
        this.assignmentHistory = assignmentHistory;
        this.latestAssignment = latestAssignment;
        this.status = status;
        this.id = id;
    }

}