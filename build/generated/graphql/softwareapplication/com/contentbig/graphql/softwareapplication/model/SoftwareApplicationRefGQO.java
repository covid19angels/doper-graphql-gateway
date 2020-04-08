package com.contentbig.graphql.softwareapplication.model;

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
import com.contentbig.graphql.place.model.*;
import com.contentbig.graphql.zommon.model.*;
import com.contentbig.graphql.softwareapplication.api.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class SoftwareApplicationRefGQO {


    private String id;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private String applicationSuite;

    private String downloadUrl;

    private String featureList;

    private String installUrl;

    private String releaseNotes;

    private String screenshot;

    private String softwareVersion;

    public SoftwareApplicationRefGQO() {
    }

    public SoftwareApplicationRefGQO( String id,  String identifier,  String name,  String alternateName,  String description,  String applicationSuite,  String downloadUrl,  String featureList,  String installUrl,  String releaseNotes,  String screenshot,  String softwareVersion) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.applicationSuite = applicationSuite;
        this.downloadUrl = downloadUrl;
        this.featureList = featureList;
        this.installUrl = installUrl;
        this.releaseNotes = releaseNotes;
        this.screenshot = screenshot;
        this.softwareVersion = softwareVersion;
    }

}