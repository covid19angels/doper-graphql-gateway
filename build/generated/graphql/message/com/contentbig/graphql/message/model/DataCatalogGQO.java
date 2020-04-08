package com.contentbig.graphql.message.model;

import com.contentbig.graphql.shoppingcart.model.*;
import java.util.*;
import com.contentbig.graphql.action.model.*;
import com.contentbig.graphql.organization.model.*;
import com.contentbig.graphql.softwareapplication.model.*;
import com.contentbig.graphql.event.model.*;
import com.contentbig.graphql.shoppingdoor.model.*;
import com.contentbig.graphql.message.api.*;
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
public class DataCatalogGQO implements NodeGQO{

    @lombok.NonNull
    private String name;

    private DataCatalogGQO parentDataCatalog;

    private Collection<DataCatalogGQO> subDataCatalogs;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private Collection<PersonGQO> followees;
    @lombok.NonNull
    private String id;

    public DataCatalogGQO() {
    }

    public DataCatalogGQO( String name,  DataCatalogGQO parentDataCatalog,  Collection<DataCatalogGQO> subDataCatalogs,  PersonGQO creator,  java.util.Date dateCreated,  Collection<PersonGQO> followees,  String id) {
        this.name = name;
        this.parentDataCatalog = parentDataCatalog;
        this.subDataCatalogs = subDataCatalogs;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.followees = followees;
        this.id = id;
    }

}